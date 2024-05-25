package com.doan.MyWechat.com.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doan.MyWechat.com.Entities.Report;
import com.doan.MyWechat.com.Entities.User;
import com.doan.MyWechat.com.Repositories.ReporterRepository;
import com.doan.MyWechat.com.Repositories.UserRepository;

@Controller
public class PersonalController {
	@Autowired ReporterRepository ReportRepo;
	
	
	@Autowired UserRepository userRepo;
	@RequestMapping(value ="/personal")
	public String index() {	  
		 return "personalpage";
	}
	
	@RequestMapping(value ="/another/{id}")
	public String viewAnotherpage(@PathVariable int id,Model Model) {
		if(id==LoginController.idUserLogin) {
			return index();
		}
		else {
		//get another info user
		User user=userRepo.findObjectById(id);
		Model.addAttribute("userAnother", user);
		

		 return "anotherpage";
		}
	}
	
	@RequestMapping(value ="/reportuser")
	public ResponseEntity<String> reporterUser(@RequestParam String reason,@RequestParam String userId,@RequestParam String reporterId) {
		System.out.println(userId+"___"+reporterId);
		Report newReport=new Report();
		newReport.setReason(reason);
		newReport.setUserId(Integer.parseInt(userId));
		newReport.setReporterId(Integer.parseInt(reporterId));
		ReportRepo.save(newReport);
		return ResponseEntity.ok("report success");
	}
	
}
