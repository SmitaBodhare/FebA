package practicsetest;

public class fibonaccis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=3;
	int b=2;
	int c=0;
	
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
