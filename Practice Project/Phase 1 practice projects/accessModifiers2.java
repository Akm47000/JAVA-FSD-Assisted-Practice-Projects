class privaccessmodifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access modifier"); 
    } 
} 

public class accessModifiers2 {
	public static void main(String[] args) {

		System.out.println("Private Access Modifier");
		privaccessmodifier  obj = new privaccessmodifier(); 
        
	}
}

