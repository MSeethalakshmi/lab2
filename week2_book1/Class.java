package week2_book1;

class Base4{
	protected void amethod() {
		System.out.println("amethod");
	}
}
public class Class extends Base4{
	public static void main(String[] args) {
		Base4 b=new Base4();
		b.amethod();
	}

}
