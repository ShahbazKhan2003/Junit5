package com.shahbaz.learning;

public class ReverseString {
	public String reverseString(String str) {
		char[] chrArray = str.toCharArray();
		int l = 0, r = chrArray.length -1;
		
		while(l < r) {
			char temp = chrArray[l];
			chrArray[l] = chrArray[r];
			chrArray[r] = temp;
			l++;
			r--;
		}
		return new String(chrArray);
	}
}
