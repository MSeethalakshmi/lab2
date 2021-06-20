package week2_book1;

class Base{}
class Sub extends Base{}
class Sub2 extends Base{}

public class CEx {
	public static void main(String[] args) {
		Base b=new Base();
		Sub s =(Sub) b;
	}
}
