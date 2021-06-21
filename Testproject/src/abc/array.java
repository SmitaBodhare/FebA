package abc;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int n=s.nextInt();
			int b[]=new int[n];
			int x=b.length;
			System.out.println("lenth is "+x);
			
			for(int a=0; a<x;a++)
			{
				b[a]=s.nextInt();
			}
			
			for(int c=0; c<x;c++)
			{
				System.out.print(b[c]+" ");
			}
	
	}

}
