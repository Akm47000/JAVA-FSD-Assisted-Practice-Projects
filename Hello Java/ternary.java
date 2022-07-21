
public class ternary {

	public static void main(String[] args) {

		int age = 19;
		boolean hasLicense = true;
		
		boolean canDrive = (age > 18) ? true : false;
		
		boolean canRentACar = canDrive ? (hasLicense ? true : false) : false;
		
		System.out.println("Age = " + age);
		System.out.println("Has License = " + hasLicense);
		System.out.println("Can Drive ? " + canDrive);
		System.out.println("Can Rent a car ? " + canRentACar);
		
		String result = canDrive ? (hasLicense ? "Has license can drive" : "No license cant drive") : "Cannot drive";
		System.out.println(result);
	}

}
