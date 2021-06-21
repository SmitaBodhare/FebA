package practicsetest;

import java.util.Scanner;

public class Arrayprimeno {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter Numbers");
		int n=s.nextInt();
		int b[]= new int [n];
		int c= b.length;
		int d=0;
		
		for(int i=0;i<c;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<c;i++)
		{
			d=0;
			for(int j=2;j<b[i];j++)
			{
				if(b[i]%2==0)
				{
					d++;
				}
			}
			if(d==0)
			{
				System.out.println(b[i]+"prime no");
			}
			else
			{
				System.out.println(b[i]+"Not prime no");
			}
		}
		
		
		
		
		
		
		
		
	}

}
