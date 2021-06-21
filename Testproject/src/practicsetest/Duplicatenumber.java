package practicsetest;

public class Duplicatenumber {

	public static void main(String[] args) {
		
		int a[]= {4,6,9,5,7,6,9,1,3,5};
		int c=a.length;
		int d=0;
		
		for(int i=0;i<c;i++)
		{
			d=0;
			for(int j=0;j<c;j++)
			{
				if(j<i&&a[i]==a[j])
				{
					break;
				}
				if(a[i]==a[j])
				{
					d++;
				}
			}
			if(d>1)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
