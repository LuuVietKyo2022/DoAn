package com.doan.MyWechat.com.Entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Likes")
public class Like {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="post_id")
	private int postId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="cmt_id")
	private int cmtId;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="is_like")
	private int isLike;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public int getCmtId() {
		return cmtId;
	}

	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	


	public int getIsLike() {
		return isLike;
	}

	public void setIsLike(int isLike) {
		this.isLike = isLike;
	}

	

	public Like(int id, int postId, int userId, int cmtId, Timestamp createdAt, int isLike) {
		super();
		this.id = id;
		this.postId = postId;
		this.userId = userId;
		this.cmtId = cmtId;
		this.createdAt = createdAt;
		this.isLike = isLike;
	}

	public Like() {
	
	}
	
	
}
