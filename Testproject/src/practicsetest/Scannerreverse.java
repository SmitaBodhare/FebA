package practicsetest;

import java.util.Scanner;

public class Scannerreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Char");
		String a=s.next();
		int c=a.length();
		char b[]=new char[c];
		String h="";
		
		for(int i=c-1;i>=0;i--)
		{
			h=h+a.charAt(i);
		}
		System.out.println(h);
		
		
		
		
		
		
		
		
		
		
		
	}

}
