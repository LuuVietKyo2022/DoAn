package com.doan.MyWechat.com.Entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id ;
	
	@Column(name="user_id")
	private int userId;

	@Column(length = 2000)
	private String content;



	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="updated_at")
	private Date updatedAt;
	
	@Column
	private int scope;
	
	@Column(name="post_images")
	private String postImages;
	
	@Column(name="post_emote")
	private String postEmote;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	public String getPostImages() {
		return postImages;
	}

	public void setPostImages(String postImages) {
		this.postImages = postImages;
	}

	public String getPostEmote() {
		return postEmote;
	}

	public void setPostEmote(String postEmote) {
		this.postEmote = postEmote;
	}

	
	


	public Post(int id, int userId, String content, Date createdAt, Date updatedAt, int scope, String postImages,
			String postEmote) {
		super();
		this.id = id;
		this.userId = userId;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.scope = scope;
		this.postImages = postImages;
		this.postEmote = postEmote;
	}

	public Post() {

	}
	
	
	
}
