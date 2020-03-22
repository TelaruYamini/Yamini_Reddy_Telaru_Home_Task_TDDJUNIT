package com.epam.Tdd_Junit;

public class RemoveFirst2Chars {

	public String removefirst2chars(String string) {
		String str=string;
			 
	   if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			str= string.substring(2,string.length());
		}
		else if(string.charAt(0)=='A')
			str=string.substring(1,string.length());
		else if(string.charAt(1)=='A')
			str=""+string.charAt(0)+string.substring(2,string.length());
		else
			str=string;
		 
		return str;  
		
	}

}
