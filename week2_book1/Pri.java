package week2_book1;

private class Base3 {// compile time error
	Base3(){
		int i=100;
		System.out.println(i);
	}
}
public class Pri extends Base3{
	static int i =200;
	public static void main(String[] args) {
		Pri p=new Pri();
		System.out.println(i);
	}
}
