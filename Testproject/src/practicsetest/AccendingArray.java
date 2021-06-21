package practicsetest;

import java.util.Scanner;

public class AccendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {6,3,9,2,5};
		int c= a.length;
		int x=0;
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i]<a[j])
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(int i=0;i<c;i++)
		{
			System.out.print(a[i]+",");
		}
	
	}
}
