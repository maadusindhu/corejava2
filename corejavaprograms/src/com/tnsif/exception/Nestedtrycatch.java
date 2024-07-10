package com.tnsif.exception;

public class Nestedtrycatch {
public static void check()
{
	String str="tns";
	int slength=str.length();
	System.out.println("string length"+str.length());
	String anotherstring=null;
	int y=6;
	try
	{
		try
		{
		System.out.println(str.charAt(y));
	}
	catch(StringIndexOutOfBoundsException ex)
	{
		System.out.println("indexoutofboundsexception"+ex.getMessage());
	}
	System.out.println("string length"+anotherstring.length());
}
catch(NullPointerException npe) {
	System.out.println("exception is throws"+npe.getMessage());

}
}
}

