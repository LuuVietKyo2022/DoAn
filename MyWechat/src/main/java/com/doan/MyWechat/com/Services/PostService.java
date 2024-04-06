package com.doan.MyWechat.com.Services;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ColumnResult;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SqlResultSetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Entities.Post;
import com.doan.MyWechat.com.Repositories.PostRepository;
import com.doan.MyWechat.com.untils.Until;



@Service
public class PostService {
	@Autowired
	ImageServices imgServices;
	@Autowired
	PostRepository postRepo;
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	public COMMON createPost(String userid, MultipartFile[] postImages, String content, String backgroundId,
			String emoteId, int scope) {
		System.out.println(userid+"_"+postImages+" "+content+" "+backgroundId+" "+emoteId+" "+scope);
		Post newPost = new Post();
		newPost.setUserId(Integer.parseInt(userid));
		newPost.setContent(content);
		newPost.setPostBackground(backgroundId);
		newPost.setPostEmote(emoteId);
		newPost.setScope(scope);
		newPost.setCreatedAt(Until.getDateTimeNow());
		postRepo.save(newPost);
		try {
			imgServices.addListImagesToPost(newPost, postImages);
		} catch (IllegalStateException e) {
			return COMMON.CREATE_POST_ERROR;
		} catch (IOException e) {
			return COMMON.CREATE_POST_ERROR;
		}
		return COMMON.CREATE_POST_SUCESS;
	}
	public List<Map<String,String>> getListPost() {
		String sql="SELECT \r\n"
				+ "tbl_user.username AS username,\r\n"
				+ "tbl_user.avatar AS avatar,\r\n"
				+ "tbl_post.content AS content,\r\n"
				+ "tbl_post.post_images AS post_images,\r\n"
				+ "(SELECT tbl_common.value FROM commons AS tbl_common WHERE tbl_common.key=tbl_post.post_emote AND tbl_common.name='emote_post') AS post_emote,\r\n"
				+ "(SELECT tbl_common.value FROM commons AS tbl_common WHERE tbl_common.key=tbl_post.post_background AND tbl_common.name='background_post') AS post_background,\r\n"
				+ "tbl_post.created_at AS created_at,\r\n"
				+ "tbl_post.scope AS scope\r\n"
				+ "FROM Posts AS tbl_post\r\n"
				+ "INNER JOIN  users AS tbl_user\r\n"
				+ "ON tbl_post.user_id=tbl_user.id\r\n"
				+ "ORDER BY tbl_post.created_at DESC \r\n"
				+ "";
		List<Map<String,String>> listPosts=entityManager.createNativeQuery(sql).getResultList();
		for (Object object : listPosts) {
			Object[] objArr = (Object[]) object;
			if(objArr[3]!=null) {
				String[] arrayUrlImages=objArr[3].toString().split(";");
				List<String> listUrlImage = new ArrayList<>();
				if(arrayUrlImages!=null) {
					for (int i = 0; i < arrayUrlImages.length; i++) {
						listUrlImage.add(arrayUrlImages[i]);
					}
				}
				if(listUrlImage.size()>0) {
					objArr[3]=listUrlImage;
				}else {
					objArr[3]=null;
				}
			}
			if(objArr[6]!=null) {
				Timestamp now = Until.getDateTimeNow();
				LocalDateTime lcDateTimeNow = now.toLocalDateTime();
				Timestamp timeCreatePost=(Timestamp) objArr[6];
				LocalDateTime lcCreatePost=timeCreatePost.toLocalDateTime();
				if((lcDateTimeNow.getYear()-lcCreatePost.getYear())>0) {
					objArr[6]=lcCreatePost.getDayOfMonth()+" tháng "+lcCreatePost.getMonthValue()+" "+lcCreatePost.getYear();
				}else if((lcDateTimeNow.getMonthValue()-lcCreatePost.getMonthValue())>0) {
					objArr[6]=lcDateTimeNow.getMonthValue()-lcCreatePost.getMonthValue()+ " tháng trước";
				}else if((lcDateTimeNow.getDayOfMonth()-lcCreatePost.getDayOfMonth())>0) {
					objArr[6]=lcDateTimeNow.getDayOfMonth()-lcCreatePost.getDayOfMonth()+ " ngày trước";
				}else if((lcDateTimeNow.getHour()-lcCreatePost.getHour())>0) {
					objArr[6]=lcDateTimeNow.getHour()-lcCreatePost.getHour()+ " giờ trước";
				}
				else if((lcDateTimeNow.getMinute()-lcCreatePost.getMinute())>0) {
					objArr[6]=lcDateTimeNow.getMinute()-lcCreatePost.getMinute()+ " phút trước";
				}else if((lcDateTimeNow.getSecond()-lcCreatePost.getSecond())>0) {
					objArr[6]=lcDateTimeNow.getSecond()-lcCreatePost.getSecond()+ " giây trước";
				}else {
					objArr[6]="vừa xong";
				}
				
			}
		}
		
		
		return listPosts;
		}
		
	}
