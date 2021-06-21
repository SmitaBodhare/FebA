package practicsetest;

import java.util.Scanner;

public class Amstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int x=n;
		int w=n;
		int c=0;
		int h=0;
		int d=0;
		int e=0;
		
		for(int i=1;i<=10;i++)
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
			h=c;
			for(int j=1;j<d;j++)
			{
				h=c*h;
			}
			e=e+h;
			w=w/10;
		}
		if(e==n)
		{
			System.out.println("Amstrong no");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
		
		
		
		
		
	}
		
}
