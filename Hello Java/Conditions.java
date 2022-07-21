
public class Conditions {

	public static void main(String[] args) {
		boolean isAlian = false;
		if(isAlian) {
			System.out.println("It is an alian");
		}
		if(!isAlian) {
			System.out.println("It is not an alian");
		}
		String name = "max";
		if(name == "max") {
			System.out.println("Correct name");
		}
		boolean x = true;
		boolean y = false;
		if(x && y) {
			System.out.println("both the conditions are true");
		}else if(x) {
			System.out.println("only x is true");
		}else {
			System.out.println("only y is true");
	
		}
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println("a < b = " + (a<b));
		System.out.println("a < b and a < c " + (a<b && a<c));//logical AND
		System.out.println("a < b and a < c " + (a<b & a<c));//bitwise AND
		
		System.out.println("a < b and a < c = " + (a<b && ++a<c));
		System.out.println("A after logical and = " + a);
		System.out.println("a < b and a < c = " + (a<b & ++a<c));
		System.out.println("A after bitwise and = + a");
		
		boolean mybool = false;
		if (mybool = false) {
			System.out.println("x");
		}else {
			System.out.println("y");
		}
		System.out.println("what will be the value ? " + (mybool=false));
		}
	}


