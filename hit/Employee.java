package hit;

public class Employee {
int id;
String empName;
Employee(int id,String name){
	this.id=id;
	this.empName=name;	
}
void info() {
	System.out.println("ID: "+id+   
			"  Employee Name: "+empName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj1=new Employee(101,"Deva");
Employee obj2=new Employee(102,"Seetha");
obj1.info();
obj2.info();

	}

}
