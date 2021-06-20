package part2;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=scan.nextInt();
		int i=1;
		do
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
	while(i <= 10);
        

}
}
