package week2_book1continue;

public class Line {
	public static void main(String[] args) {
		Line l=new Line();
		l.amethod();
	}
	public void amethod() {
		int ia[]= new int[4];
		for(int i=0;i<ia.length;i++) {
			ia[i]=i;
			System.out.println(ia[i]);
		}
	}
}
