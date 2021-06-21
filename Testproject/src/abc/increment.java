package abc;

import java.util.Scanner;

public class increment {

	public static void main(String[] args) {
		int orignal;	int result;
		int d1=0;
		int d2=0;
		int d3=0;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		
		orignal=n;
		
		d1=n%10;
		n=n/10;
		
		d2=n%10;
		n=n/10;
		
		d3=n%10;
		
		result=d1*d1*d1 + d2*d2*d2 + d3*d3*d3;
		
		if(result==orignal)
		{
			System.out.println("amstrong no");
		}
		else
		{
			System.out.println("not amstrong no");
		}



	}

}
