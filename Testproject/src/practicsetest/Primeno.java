package practicsetest;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
	
		int a=18;
		int d=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				d++;
			}
		}
		
		if(d==0)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		
		
		
		
		
		
		
	}
}
