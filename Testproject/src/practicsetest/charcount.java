package practicsetest;

import java.util.Scanner;

public class charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="SanjanaSanjana";
		int c=a.length();
		int d=0;
		
		for(int i=0;i<c;i++)
		{
			d=0;
			for(int j=0;j<c;j++)
			{
				if(j<i&&a.charAt(i)==a.charAt(j))
				{
					break;
				}
				if(a.charAt(i)==a.charAt(j))
				{
					d++;
				}
			}
			if(d>0)
			{
				System.out.println(a.charAt(i)+" "+d);
			}
		}
		
		
		
		
		
		

	}

}
