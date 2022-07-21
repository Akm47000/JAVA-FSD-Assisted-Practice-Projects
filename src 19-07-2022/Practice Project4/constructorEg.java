class StuInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorEg {
	
	public static void main(String[] args) {

		StuInfo stu1=new StuInfo();
		StuInfo stu2=new StuInfo();

		stu1.display();
		stu2.display();
		}
	
}
