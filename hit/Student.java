package hit;

public class Student {
	String name,city;
	int age;
	static int m;
	void printData() {
		System.out.println("Student name: "+name);
		System.out.println("Student city: "+city);
		System.out.println("Student Age: "+age);
	}
}
class Stest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1=new Student();
     Student s2=new Student();
     s1.name="Seetha";
     s1.city="Alangulam";
     s1.age=20;
     s2.name="ramya";
     s2.city="Alangulam";
     s2.age=22;
     s2.printData();
     s1.printData();
     s1.m=22;
     s2.m=20;
     Student.m=22;
     System.out.println("s1.m= "+s1.m);
     System.out.println("s2.m= "+s2.m);
     System.out.println("Student.m= "+Student.m);
	}

}
