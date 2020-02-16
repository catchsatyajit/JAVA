package com.satya.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		List<String> emails=new ArrayList<String>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.co.in");
		emails.add("user@domaincom");
		 
		//Invalid emails
		emails.add("user#domain.com");
		emails.add("@yahoo.com");
		String regex ="^(.+)@(.+)$";;
		Pattern p=Pattern.compile(regex);
		for(String s:emails) {
			Matcher m=p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
			
		}
	}

}
