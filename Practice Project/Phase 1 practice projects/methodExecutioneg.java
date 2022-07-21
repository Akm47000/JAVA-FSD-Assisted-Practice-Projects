
public class methodExecutioneg {
	
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		methodExecutioneg b=new methodExecutioneg();
		int ans= b.multipynumbers(20,5);
		System.out.println("Multipilcation is :"+ans);
		}

}
