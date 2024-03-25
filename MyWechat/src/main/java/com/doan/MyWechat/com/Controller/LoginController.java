package com.doan.MyWechat.com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Services.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String index() {
		return "loginpage";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ResponseEntity<String> login(HttpServletRequest request,@RequestParam String email,@RequestParam String password) {
		COMMON status=userService.login(request,email,password);
		if(status.equals(COMMON.LOGIN_SUCCESS)) {
			return ResponseEntity.ok("success");
		}else if(status.equals(COMMON.LOGIN_BY_NEW_EMAIL)) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("login by new email");
		}else if(status.equals(COMMON.LOGIN_ERROR_INVALID_PASSWORD)){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("wrong password");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
	}
}
