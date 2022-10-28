// author - Srikruthi Vedantham

import java.lang.*;
import java.util.*;

public class urinals {
	public static void main(String[] args)
	{
		System.out.println("Enter Your Strings: ");
		getString();
	}
	
	public static void getString()
	{
		Scanner sc =new Scanner(System.in);
		String k = sc.nextLine();
		while(!k.equals("-1"))
		{
			if(validateString(k))
			{
				System.out.println("Sucess");
				
			}
			else 
			{
				System.out.println("Not Success");
				
			}
			k = sc.nextLine();
		}
	}
	
	public static boolean validateString(String inpStr)
	{
		int c=0;
		for(int i=0;i<inpStr.length();i++)
		{
			if(inpStr.charAt(i)=='1'  || inpStr.charAt(i)== '0')
				c=0;
			else
				c=1;
		}
		if(c==0)
			return true;
		else
			return false;
	}

}

