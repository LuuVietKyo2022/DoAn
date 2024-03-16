package com.doan.MyWechat.com.Entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(length = 50)
	private String type;
	
	@Column(name = "type_id")
	private int typeId;

	@Column(name = "read_flg")
	private boolean readFlg;
	
	@Column(name="created_at")
	private Date createdAt;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public boolean isReadFlg() {
		return readFlg;
	}

	public void setReadFlg(boolean readFlg) {
		this.readFlg = readFlg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Notification(int id, int userId, String type, int typeId, boolean readFlg, Date createdAt) {
		
		this.id = id;
		this.userId = userId;
		this.type = type;
		this.typeId = typeId;
		this.readFlg = readFlg;
		this.createdAt = createdAt;
	}

	public Notification() {
		
	}
	
	
}
