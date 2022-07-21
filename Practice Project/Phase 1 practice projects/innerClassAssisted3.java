abstract class anonymousInnerClass {
	   public abstract void display();
	}


	public class innerClassAssisted3 {

	public static void main(String[] args) {
	anonymousInnerClass i = new anonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
