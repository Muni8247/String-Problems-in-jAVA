package com.company.linear_serach;
import java.util.*;

public class Duplicate_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		System.out.println();
		
		char[] Arr=str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<Arr.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<Arr.length;j++) {
				if(Arr[i]==Arr[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(Arr[i]);
			}
		}
		System.out.print(sb3);
		

	}

}
