package practicsetest;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123321;
		int x=n;
		int w=n;
		int c=0;
		int d=0;
		int h=0;
		
		for(int i=0;i<=10;i++)
		{
			if(x!=0)
			{
				d++;
				x=x/10;
			}
		}
		for(int i=1;i<=d;i++)
		{
			c=w%10;
			h=h*10+c;
			w=w/10;
		}
		if(n==h)
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palidrome");
		}
		
		
	}

}
