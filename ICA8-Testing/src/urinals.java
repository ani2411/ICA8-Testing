// author - Sesha Sai Aneeswar

import java.lang.*;
import java.util.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class urinals {
	public static void main(String[] args)
	{
		System.out.println("Enter Your preference:\n 1. Enter input through dat file \n 2. Enter input through command prompt ");
		Scanner sc =new Scanner(System.in);
		int s = sc.nextInt();
		
		try {
			if(s==1) {
			File file = new File("src//urinal.dat");
			FileWriter myWriter = new FileWriter("src//urinal.txt");
			Scanner scnr = new Scanner(file);
			while(scnr.hasNextLine()){
			   String x = scnr.nextLine();
			   //System.out.println(x);
			   boolean validation = validateString(String.valueOf(x));
			   if(validation) {
				   int count = countUrinals(String.valueOf(x));
				   //System.out.println(count);
				   myWriter.write(String.valueOf(count));
				   myWriter.write('\n');
			   }      
        }
			myWriter.close();
			}
			else {
				while(true)
				{
					//System.out.println(k);
					System.out.println("Enter Your Strings: ");
					Scanner sc1 =new Scanner(System.in);
					String k = sc1.nextLine();
					//System.out.println(k);
					if(k.equals("-1")) {
						break;
					}
					boolean validation = validateString(String.valueOf(k));
					if(validation) {
						int count = countUrinals(String.valueOf(k));
						System.out.println(count);
					}
				}
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
	}
	public static Integer countUrinals(String s)
    {
        StringBuilder input = new StringBuilder(s);
        int counter = 0;
        Boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0'){
                if(i==0 ){
                    if (input.charAt(i+1) == '0' ){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    }
                }
                else if (i==input.length()-1) {
                    if (input.charAt(i-1) == '0'){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    }
                }
                else {
                    if (input.charAt(i+1) == '0' && input.charAt(i-1) == '0'){
                        input.replace(i,i+1,"1");
                        counter = counter + 1;
                    } }
            }
            else {
            	if(i==0 ){
                    if (input.charAt(i+1) == '1' ){                       
                        flag = false;                       
                    }
                }
                else if (i==input.length()-1) {
                    if (input.charAt(i-1) == '1'){
                        flag = false;
                    }
                }
                else {
                    if (input.charAt(i+1) == '1' && input.charAt(i-1) == '1'){
                        flag = false;
                    } }
            }
            if(flag==false){
            	break;
            }
        }
        if(flag) {
            return counter;
            }
        else {
        	return -1;
        }
    }
	public static boolean validateString(String inpStr)
	{
		int f=0;
		for(int i=0;i<inpStr.length();i++)
		{
			if(inpStr.charAt(i)=='1'  || inpStr.charAt(i)== '0') {
				f=0;
			}
			else {
				f=1;
			}
		}
		if(f==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
