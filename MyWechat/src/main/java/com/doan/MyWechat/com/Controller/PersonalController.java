package com.doan.MyWechat.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalController {
	
	@RequestMapping(value ="/personal")
	public String index() {	  
		 return "personalpage";
	}
}
