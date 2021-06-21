package abc;

import java.util.Scanner;

public class Amstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int n=s.nextInt();
			int x=n;	
			int w=n;
			int d=0;
			int c=1;
			int e=0;
			int count=1;
		
		for(int b=1;b<=n;b++)	
		{
			 n=n/10;
			 if(n!=0)
			 {
			 count++;
			 }
		}
		System.out.println("number of digit" +count);
			for(int a=1;a<=count;a++)
			{
				d=x%10;
				x=x/10;
				c=(int) Math.pow(d,count);
				e=e+c;
				
			}
			if(e==w)
			{
				System.out.println("amstrong no");
			}
			else
			{
				System.out.println("not amstrong no");
			}
			
		
	}

}
