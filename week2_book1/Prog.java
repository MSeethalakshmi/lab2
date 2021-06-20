package week2_book1;

public class Prog {
	public static void main(String[] args) {
		Prog obj=new Prog();
		obj.run();
	}
	int i=0;
	public int run() {
		while(true) {
			i++;
			System.out.println("i="+i);
		}
		return 1;//compile time error
	}
}
