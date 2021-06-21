package package1;

public class implement1 implements interface1{

	public void test() {
		System.out.println("Implements method1");
	}
	public void demo() {
		System.out.println("Implements method2");
	}
	public void ABC() {
		 System.out.println("Default method of Overirde");
	 }
	
	public static void main(String[] args) {
	
		implement1 x=new implement1();
		x.ABC();
		x.demo();
		x.test();
		interface1.PQR();
		System.out.println(interface1.a);
		
		
		
	}
}

