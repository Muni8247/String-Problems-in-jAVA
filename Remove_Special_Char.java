package com.company.linear_serach;
import java.util.*;

public class Remove_White_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the STring with specila Characters: ");
		String str=sc.nextLine();
		System.out.println();
		String plainstr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print("Your plain string is: "+plainstr);
		

	}

}
