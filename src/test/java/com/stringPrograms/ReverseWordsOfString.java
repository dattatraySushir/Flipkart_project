package com.stringPrograms;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		String s= "I am a sdet engineer";
		String[] str=s.split(" ");
		
		for (int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}

}
