package com.company.linear_serach;
import java.util.*;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		System.out.println();
		
		char[] chArr=str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--){
			System.out.print(chArr[i]);
			
		}
			
		}

	}


