package practicsetest;

public class wring {

	static String a = "velocityi";
	static String b ="VELOCITYI";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a.equals(" Velocity"));//comapare given string case sensitive
		System.out.println(a.equalsIgnoreCase(b));//comapare given string not case sensitive
		System.out.println(a.charAt(2));		//gave at index 2 what char present
		System.out.println(a.indexOf("v"));		//give index of v
		System.out.println(a.concat(" abc"));	//add another word
		System.out.println(a.trim());		//remove starting and ending space
		System.out.println(a.toUpperCase());//convert fully capital later
		System.out.println(a.toLowerCase());//convert to small letter
		System.out.println(a.replace("v", "b"));//replace old char with new char
		System.out.println(a.replace("vel", "sor"));//replace sequence of old char with new char
		System.out.println(a.substring(4)); //start from 4th position
		System.out.println(a.substring(2, 6));//start from 4th and end with 5
		System.out.println(a.lastIndexOf("i"));//show last index of i
		System.out.println(a.startsWith("v"));//campare is word start with v
		System.out.println(a.endsWith("i"));//compare is word end with i
		System.out.println(a.length());
		
		
		
		
	}
	
}