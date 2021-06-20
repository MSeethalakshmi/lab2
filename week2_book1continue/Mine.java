package week2_book1continue;

abstract class MineBase{
	abstract void amethod();
	static int i;
}

public class Mine extends MineBase {
	public static void main(String[] args) {
		int[] ar = new int[5];
		for (i=0;i<ar.length;i++)
			System.out.println(ar[i]);//a sequence of 5 0's will be printed
	}

	@Override
	void amethod() {
		// TODO Auto-generated method stub
		
	}
}
