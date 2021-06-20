package part2;
import java.util.Scanner;
class Box{
	double width,height,depth;
}
public class BoxDemo {
public static void main(String args[]) {
	Box mybox=new Box();
	Scanner scan=new Scanner(System.in);
	double vol;
	System.out.println("Enter the width: ");
	double width=scan.nextDouble();
	System.out.println("Enter the height: ");
	double height=scan.nextDouble();
	System.out.println("Enter the depth: ");
	double depth=scan.nextDouble();
	
	vol=width*height*depth;
	System.out.println("Volume of box is:" +vol);
}
}
