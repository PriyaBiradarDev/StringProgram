package com.string.nt;

public class ReverseTheStringUsingItratorMethod {
	public static void main(String[] args) {

		String str = "Priya";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));

		}
	}

}
//output=
a
y
i
r
P
