
public class callbyvalueMethod {
	
	int val=250;

	int operation(int val) {
		val =val*20/200;
		return(val);
	}

	public static void main(String args[]) {
		callbyvalueMethod d = new callbyvalueMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(200);
		System.out.println("After operation value of data is "+d.val);
		}

}
