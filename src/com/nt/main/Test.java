package com.nt.main;

public class Test {

public static void main(String[] args) {
	String [] arr= {"flower","flow","flight"};
	String prefix="";
	
	if(arr.length>0) {
		String firstword=arr[0];
		for(int i=0;i<firstword.length();i++) {
			char currentChar =firstword.charAt(i);
		for	(int j=1;j<arr.length;j++) {
			if(i>=arr[j].length()||arr[j].charAt(i)!=currentChar) {
				System.out.println("output"+prefix);
				return;
			}
			
		}
		prefix+=currentChar;
}
	}
	
}
}