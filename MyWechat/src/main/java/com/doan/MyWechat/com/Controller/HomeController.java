package com.doan.MyWechat.com.Controller;

import javax.persistence.criteria.CommonAbstractCriteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Services.PostService;

@Controller
public class HomeController {
	@Autowired
	PostService postService;
	
	@RequestMapping(value ="/home")
	public String index() {  
		 return "homepage";
	}
	
	@PostMapping(value ="/createstatus")
	public ResponseEntity<String> creatStatus(@RequestParam String userId,
								@RequestParam MultipartFile[] postImages,
								@RequestParam String content,
								@RequestParam String backgroundId,
								@RequestParam String emoteId,
								@RequestParam int scope) {  
		COMMON status=postService.createPost(userId,postImages,content,backgroundId,emoteId,scope);
		 return null;
	}

	
}
