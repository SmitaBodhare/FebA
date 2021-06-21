package practicsetest;

public class Reversearray {

	public static void main(String[] args) {
		
	int a[]= {6,9,4,2,4,5};
	int c=a.length;
	int x=0;
	int p=0;
	
	for(int i=c-1;i>=c/2;i--)
	{
		x=a[i];
		a[i]=a[p];
		a[p]=x;
		p++;
	}
	
	for(int i=0;i<c;i++)
	{
		System.out.print(a[i]+",");
	}
			
	}
}
