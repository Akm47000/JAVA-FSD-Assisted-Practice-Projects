class defAccessModifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access modifier"); 
     } 
} 

public class accessModifiers1 {
	
	public static void main(String[] args) {
		System.out.println("Dafault Access Modifier");
		defAccessModifier obj = new defAccessModifier(); 		  
        obj.display(); 

	}
}

