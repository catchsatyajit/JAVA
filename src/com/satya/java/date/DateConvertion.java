package com.satya.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateConvertion {

	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("dd-MM-yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
	}

}
