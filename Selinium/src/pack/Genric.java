package pack;

public class Genric <T,E> {

	public T demo(T a) {
		System.out.println(a);
		return a;
	}
	
	public E test(E j) {
		System.out.println(j);
		return j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Genric v =new Genric();
		v.demo("Velocity");
		v.test(5);
		v.demo('z');
		v.test(56.78);
		
		
	}

}
