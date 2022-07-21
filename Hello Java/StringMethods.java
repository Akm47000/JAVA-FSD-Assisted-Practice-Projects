
public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Hello world";
		System.out.println(s);
		System.out.println("length = " + s.length());
		
		System.out.println("Index of w = " + s.indexOf('w'));
	
		//print the character at position 3
		System.out.println("Character at 3 = " + s.charAt(3));
//		System.out.println("Character at 12 = " + s.charAt(12));
		
		System.out.println("Command after exception");
		
		System.out.println("Index of l = " + s.indexOf('l'));
		System.out.println("Index of second l = " + s.indexOf('l',3));
		System.out.println("substring: " + s.substring(4));
		
		String[] s2 = s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		System.out.println("index of space: " + s.indexOf(" ") );
		
		System.out.println("uppercase: " + s.toUpperCase());
		System.out.println("lowercase: " + s.toLowerCase());
		System.out.println("Replaced: " + s.replace("l", "j"));
	}
	
	

}
