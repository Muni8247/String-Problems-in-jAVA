package com.company.linear_serach;
import java.util.*;
public class Remove_White_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		System.out.println();
		
		String str1=str.replaceAll("\\s", "");
		System.out.print("After removes white spaces: "+str1);

	}

}
