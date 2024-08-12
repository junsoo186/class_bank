package com.tenco.bank.utils;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class ValueFormatter {
	public String timestamptoString(Timestamp timestamp) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(timestamp);
    }
	public String formatKoreanWon(Long amount) {
		DecimalFormat df = new DecimalFormat("#,###");
		String formatNumber = df.format(amount);
		return formatNumber + "원";
	}
}
