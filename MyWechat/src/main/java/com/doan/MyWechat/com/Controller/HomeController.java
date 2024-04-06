package com.doan.MyWechat.com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CommonAbstractCriteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Entities.Post;
import com.doan.MyWechat.com.Services.PostService;



@Controller
public class HomeController {
	@Autowired
	PostService postService;
	
	@RequestMapping(value ="/home")
	public String index(Model model) {
		List<Map<String,String>> listPosts= postService.getListPost();
		
		model.addAttribute("listPost", listPosts);
		
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
		if(status.equals(COMMON.CREATE_POST_SUCESS)) {
			return ResponseEntity.ok("succes");
		}else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
	}

	
}
