package main;

public class Tryncatch {
	
	static int a[]= {2,5,8,9,4,3};
	static int c=a.length;
	static int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		
		try 
		{
			
			for(int i=0;i<=c;i++)
			{
				System.out.println(a[i]);
				//d= a[i]%b;
				//System.out.println(d);
			}
			
		}
		catch(Exception e){
			System.out.println("Exceptions");
		}
		finally
		{
			System.out.println("Hey");
		}
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e){
			System.out.println("Exceptions");
		}*/
		
	}

}
