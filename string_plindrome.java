package com.company.linear_serach;
import java.util.*;

public class string_plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str=sc.nextLine();
		System.out.println();
		String org_str=str;
		System.out.print("Your string is: "+str);
		String rev="";
		System.out.println();
		
		//Reverse Logic
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.print("Your reverse string is: "+rev);
		System.out.println();
		
		//reverse string
		if(org_str.equals(rev)) {
			System.out.print("Your string is palindrome");
		}else {
			System.out.print("Your string is not palindrome");
		}
	}

}
