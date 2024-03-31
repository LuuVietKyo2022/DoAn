package com.doan.MyWechat.com.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.doan.MyWechat.com.Common.COMMON;

@Service
public class PostService {
	public COMMON createPost(String userid, MultipartFile[] postImages, String content, String backgroundId,
			String emoteId, int scope) {
		System.out.println(userid+"_"+postImages+" "+content+" "+backgroundId+" "+emoteId+" "+scope);
		return null;
	}
}
