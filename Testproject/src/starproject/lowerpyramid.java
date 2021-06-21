package starproject;

public class lowerpyramid {
	
	public static void main(String[] args) {
		
		for(int a=5;a>=1;a--)
		{
			for(int c=5;c>a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a*2-1;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
