package com.practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String pt = "abc";
		String txt = "hello abc";

		Pattern p = Pattern.compile("4{2}", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("hello abcd1233");

		boolean result = m.find();
		System.out.println(result);

	}

}
