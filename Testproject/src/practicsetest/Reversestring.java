package practicsetest;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		String a="Sanjana";
		int c=a.length();
		String h="";
		char b[]=new char[c];
		for(int i=c-1;i>=0;i--)
		{
			b[i]=a.charAt(i);
			h=h+b[i];
			//h=h+a.charAt(i);
		}
		System.out.println(h);
	}

}
