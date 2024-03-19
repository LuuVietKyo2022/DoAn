package com.doan.MyWechat.com.Services;

import java.io.File;
import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.doan.MyWechat.com.Entities.User;

@Service
public class ImageServices {
	private boolean isEmptyUploadFile(MultipartFile[] images) {
		if (images == null || images.length <= 0)
			return true;

		if (images.length == 1 && images[0].getOriginalFilename().isEmpty())
			return true;

		return false;
	}

	/**
	 * dùng để kiểm tra xem admin có upload ảnh product hay không
	 * @param image
	 * @return
	 */
	private boolean isEmptyUploadFile(MultipartFile image) {
		return image == null || image.getOriginalFilename().isEmpty();
	}
	
	private String getUniqueUploadFileName(String fileName) {
		String[] splitFileName = fileName.split("\\.");
		return splitFileName[0] + System.currentTimeMillis() + "." + splitFileName[1];
	}
	
	@Transactional
	public User addImage(User a, MultipartFile avatar)
			throws IllegalStateException, IOException {

		//kiểm tra có upload ảnh
		if (!isEmptyUploadFile(avatar)) { 
			
			String fileName = getUniqueUploadFileName(avatar.getOriginalFilename());
			
			
			String pathToAvatar = "E:/ProjectDoAn/DoAn/images/userImages/avatar/" + fileName;

			// lưu avatar vào đường dẫn trên
			avatar.transferTo(new File(pathToAvatar));

			a.setAvatar("/userImages/avatar/" + fileName);
		}
		return a;

		
	}
	
}
