package part2;
import java.util.Scanner;
public class SwapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x=scan.nextInt();
		
		System.out.print("Enter second number: ");
		int y=scan.nextInt();
		scan.close();
		System.out.printf("\nBefore swapping 'x': %d, 'y': %d %n",x,y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.printf("\nAfter swapping 'x': %d, 'y': %d %n",x,y);
	}

}
