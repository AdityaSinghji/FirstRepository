package stringmethods.practice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args)
	{
		String s ="Aditya Singh ";
		
		System.out.println(s.charAt(4));
		//
		
		s=s.concat("From Qspiders");
		System.out.println(s);
		
		//--------------------------------
		
		System.out.println(s.contains("piders"));
		//-----------------------------------------
		System.out.println(s.length());
		//-----------------------------------------
		System.out.println(s.endsWith("ers"));
		//----------------------------------------
		System.out.println(s.startsWith("  Aditya"));
		//-------------------------------------------
		System.out.println(s.equals("ABCD"));
		System.out.println(s.equals("  Aditya Singh From Qspiders"));
		//------------------------------------------------------------
		
		System.out.println(s.equalsIgnoreCase("  AdiTya Singh From Qspiders"));
		
		System.out.println(s.indexOf('A',1));
		
		String a= "Hi how are you?";
		String[] s1= a.split(" ");
		System.out.println(Arrays.toString(s1));
	}

}
