package com.doan.MyWechat.com.Services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.MyWechat.com.Common.COMMON;
import com.doan.MyWechat.com.Entities.User;
import com.doan.MyWechat.com.Repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepo; 
	public COMMON reigisterAccount(String email, String password) {
		User newUser = new User();
		User oldUser = userRepo.findTopUserByEmail(email);
		if(oldUser!=null) {
			System.out.println(COMMON.REGISTER_STATUS_ERROR_DUPLICATE_MAIL +" : "+COMMON.REGISTER_STATUS_ERROR_DUPLICATE_MAIL.getValue());
			return COMMON.REGISTER_STATUS_ERROR_DUPLICATE_MAIL ;
		}
		newUser.setEmail(email);
		newUser.setUsername(email);
		//hashPassword
		String hashPassword="";
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			hashPassword=digest.toString();
			newUser.setPassword(hashPassword);
			userRepo.save(newUser);
		} catch (NoSuchAlgorithmException e) {
			return COMMON.REGISTER_STATUS_ERROR ;
		}
		
		return COMMON.REGISTER_STATUS_SUCESS ;
		
	}

}
