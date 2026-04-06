package com.data_Validation;

public class DataValidation 
{
	public static boolean validMobileNumber(long mobileNumber)
	{
		String st=mobileNumber+"";
		char ch=st.charAt(0);
		if((ch=='9'||ch=='8'||ch=='7'|| ch=='6')&&(st.length()==10))
				return true;
		return false;		
	}
	
	public static boolean emailValidation(String email)
	{
		
		return email.endsWith("@gmail.com");
	}

}
