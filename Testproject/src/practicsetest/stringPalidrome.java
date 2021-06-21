package practicsetest;

import java.util.Scanner;

public class stringPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		String a=s.next();
		int c=a.length();
		String d="";
		for(int i=c-1;i>=0;i--)
		{
			d=d+a.charAt(i);
		}
		if(d.equals(a))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not Pallidrome");
		}
	}

}
