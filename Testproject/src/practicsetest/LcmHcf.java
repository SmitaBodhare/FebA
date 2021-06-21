package practicsetest;

import java.util.Scanner;

public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=12;
		int b=16;
		int hcf=0;
		int lcm=0;
		int d=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==b%i)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		for(int p=1;p<=10;p++)
		{
			for(int q=1;q<=10;q++)
			{
				if(a*p==b*q&&d==0)
				{
					lcm=a*p;
					d++;
				}
			}
		}
		System.out.println(lcm);
	}

}
