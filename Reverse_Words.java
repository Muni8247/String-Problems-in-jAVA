package com.company.linear_serach;
import java.util.*;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("");
		String[] words=str.split(" ");
		String strrev=" ";
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWord=" ";
			
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			strrev=strrev+revWord;
		}
		System.out.print(strrev);

	}

}
