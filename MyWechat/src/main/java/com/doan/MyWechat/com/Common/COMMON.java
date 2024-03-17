package com.doan.MyWechat.com.Common;

import java.util.Iterator;

public enum COMMON {
	REGISTER_STATUS_ERROR_DUPLICATE_MAIL("Register Error by duplicate mail of another user in database"),
	REGISTER_STATUS_SUCESS("REGISTER SUCCCESS"),
	REGISTER_STATUS_ERROR("REGISTER ERORR");

	private String value;
	COMMON(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public COMMON getCode(String value) {
		for (COMMON common : COMMON.values()) {
			if(common.getValue().equals(value)) {
				return common;
			}
		}
		throw new IllegalArgumentException("Không có enum nào tương ứng với giá trị: " + value);
	}
	

	
}
