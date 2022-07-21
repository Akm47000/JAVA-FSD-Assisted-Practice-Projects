public class innerClassAssisted2 {

private String text="Inner Classes";

 void display(){  
	 class Inner{  
		 void text(){
			 System.out.println(text);
		 }  
  }  
  
  Inner l=new Inner();  
  l.text();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted2  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}
