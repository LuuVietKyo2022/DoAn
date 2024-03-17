package com.doan.MyWechat.com.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Entities.User;
import com.doan.MyWechat.com.Services.UserService;


@Controller
public class RegisterController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String index() {
		return "registerpage";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ResponseEntity<String> registerAccount(@RequestBody User user) {
		COMMON status=userService.reigisterAccount(user.getEmail(),user.getPassword());
		if (status.equals(COMMON.REGISTER_STATUS_SUCESS)) {
			return ResponseEntity.ok("success");
		}else if (status.equals(COMMON.REGISTER_STATUS_ERROR_DUPLICATE_MAIL)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error by dupplicate mail");
		}
		else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
	}
	
	@RequestMapping(value = "/addinfor",method = RequestMethod.GET)
	public String addInforUser() {
		return "addinforpage";
	}
	
}
