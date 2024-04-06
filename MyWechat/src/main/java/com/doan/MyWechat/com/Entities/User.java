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
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column 
	private String password;
	
	@Column 
	private String avatar;
	
	@Column(name="cover_photo") 
	private String coverPhoto; 

	@Column(name="first_name")  
	private String firstName; 
	
	@Column(name="last_name") 
	private String lastName; 
	
	@Column(length = 10) 
	private String gender; 
	
	@Column(name="birth_day") 
	private Date birthDay;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="updated_at") 
	private Timestamp updatedAt;
	
	@Column 
	private String address1;
	
	@Column
	private String address2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}


	public User(int id, String username, String email, String password, String avatar, String coverPhoto,
			String firstName, String lastName, String gender, Date birthDay, Timestamp createdAt, Timestamp updatedAt,
			String address1, String address2) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.coverPhoto = coverPhoto;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDay = birthDay;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.address1 = address1;
		this.address2 = address2;
	}

	public User() {
		
	}

	
}
