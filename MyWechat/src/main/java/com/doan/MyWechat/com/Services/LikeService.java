package com.doan.MyWechat.com.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Entities.Like;
import com.doan.MyWechat.com.Repositories.LikeRepository;
import com.doan.MyWechat.com.untils.Until;

@Service
public class LikeService {
	@Autowired
	LikeRepository likeRepo;
	
	public int likePost(String postId, String userId, String isLike) {
		int countUserLikeThisPost=likeRepo.findCountByPostIdAndUserId(Integer.parseInt(postId), Integer.parseInt(userId));
		if(countUserLikeThisPost==0) {
			Like newLike = new Like();
			newLike.setPostId(Integer.parseInt(postId));
			newLike.setUserId(Integer.parseInt(userId));
			newLike.setIsLike(Integer.parseInt(isLike));
			newLike.setCreatedAt(Until.getDateTimeNow());
			likeRepo.save(newLike);
		}else {
			Like likeInDb=likeRepo.findLikeByPostIdAndUserId(Integer.parseInt(postId), Integer.parseInt(userId));
			likeInDb.setIsLike(Integer.parseInt(isLike));
			likeRepo.save(likeInDb);
			
		}
		return likeRepo.findCountByPostIdAndUserIdAndIsLike(Integer.parseInt(postId), Integer.parseInt(userId));
		
	}
}
