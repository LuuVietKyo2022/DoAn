package com.doan.MyWechat.com.untils;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Until {
	static public Timestamp getDateTimeNow() {

		LocalDateTime now = LocalDateTime.now() ;
		Timestamp dateSql = Timestamp.valueOf(now);
		return dateSql;
	}
}
