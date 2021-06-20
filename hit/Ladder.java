package hit;
import java.util.Scanner;
class Ladder {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int a=in.nextInt();
for(int i=1;i<=a;i++) {
	for(int j=1;j<=i;j++)
		System.out.println(j);
	for(int k=i-1;k>=i;k--)
		System.out.println(k);
	System.out.println("\n");
}
	}

}
