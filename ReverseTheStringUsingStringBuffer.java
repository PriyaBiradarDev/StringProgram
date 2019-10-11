package com.string.nt;

public class ReverseTheStringUsingStringBuffer {
	public static void main(String[] args) {

		String str = "Priya";

		// 1. Using StringBuffer Class

		StringBuffer sbf = new StringBuffer(str);

		System.out.println(sbf.reverse());

	}

}
//output=ayirP
