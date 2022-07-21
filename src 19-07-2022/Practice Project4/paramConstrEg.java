class Emp{
	int id;
	String name;

	Emp(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrEg {
	
	public static void main(String[] args) {

		Emp emp1=new Emp(2,"Akanksh");
		Emp emp2=new Emp(10,"Mulka");
		emp1.display();
		emp2.display();
			}

}
