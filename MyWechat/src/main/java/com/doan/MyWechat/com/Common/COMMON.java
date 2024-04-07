package com.doan.MyWechat.com.Common;

import java.util.Iterator;

public enum COMMON {
	REGISTER_STATUS_ERROR_DUPLICATE_MAIL("Register Error by duplicate mail of another user in database"),
	REGISTER_STATUS_SUCESS("REGISTER SUCCCESS"),
	REGISTER_STATUS_ERROR("REGISTER ERORR"),
	REGISTER_STATUS_ERROR_ALOTHIRM("ALOTHIRM CREATE HASH PASSWORD BE ERROR"),
	ADDINFOR_STATUS_ERROR("ADD INFOR ERORR"),
	ADDINFOR_STATUS_SUCCESS("ADD INFOR SUCCCESS"),
	ADDINFOR_STATUS_SUCCESS_ERROR_PARSE_DATE("ADD INFOR SUCCCESS ERROR PARSE DATE"),
	LOGIN_BY_NEW_EMAIL("LOGIN BY NEW EMAIL"),
	LOGIN_SUCCESS("LOGIN SUCCESS"),
	LOGIN_ERROR_INVALID_PASSWORD("LOGIN BY INVALID PASSWORD"),
	LOGIN_ERROR_ALOTHIRM("ALOTHIRM CREATE HASH PASSWORD BE ERROR"),
	CREATE_POST_ERROR("CREATE POST ERROR"),
	CREATE_POST_SUCESS("CREATE POST SUCCES"),
	LIKE_POST_SUCESS("LIKE POST SUCCES");
	

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
