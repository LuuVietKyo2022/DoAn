package com.doan.MyWechat.com.Repositories;

import com.doan.MyWechat.com.Entities.User;

public interface UserRepository extends BaseRepository<User, Integer> {
	public User findTopUserByEmail(String email);
}
