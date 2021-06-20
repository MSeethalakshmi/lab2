package hit;

public class Bird {
int age;
String name;
Bird(){
	System.out.println("This is tha parent");
}
Bird(String x){
	name=x;
	System.out.println("This is the "+name);
}
Bird(int y,String z){
	
	age=y;
	name=z;
	System.out.println("This is the "+age+" years "+name);
}
public static void main(String arr[]) {
	Bird a=new Bird();
	Bird b=new Bird("Maina");
	Bird c=new Bird(20,"Sparrow");
}
}
