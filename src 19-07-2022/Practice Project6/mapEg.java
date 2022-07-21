import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class mapEg {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Ravi");    
	      hm.put(2,"Raju");    
	      hm.put(3,"Sai");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Akanksh");  
	      ht.put(5,"Akshay");  
	      ht.put(6,"Uma");  
	      ht.put(7,"Krishna");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Ram");    
	      map.put(9,"Seetha");    
	      map.put(10,"Ravana");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  


}
