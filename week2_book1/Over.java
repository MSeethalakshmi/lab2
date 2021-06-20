package week2_book1;

class Base5{
	private void amethod(int iBase) {
		System.out.println("Base.amethod");
	}
}

public class Over extends Base5 {
	public static void main(String[] args) {
		Over o=new Over();
		int iBase=0;
		o.amethod(iBase);
	}
	public void amethod(int iOver) {
		System.out.println("Over.amethod");//over.amethod
	}
}
