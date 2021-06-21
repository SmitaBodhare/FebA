package practicsetest;

public class Dublicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"hello","you","hi","to","you","hi","to"};
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
