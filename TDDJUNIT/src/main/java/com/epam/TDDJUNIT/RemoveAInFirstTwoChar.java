package com.epam.TDDJUNIT;

public class RemoveAInFirstTwoChar {
	public String remove(String str) {
		String res = "";
		int len=str.length();
		if(len>0 && str.charAt(0)!='A')
			res+=str.charAt(0);
		if(len>1 && str.charAt(1)!='A') 
			res+=str.substring(1);
		else if(len>1)
			res+=str.substring(2);
		return res;
	}
}
