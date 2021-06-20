package part2;
import java.util.Scanner;
public class SeasonSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    System.out.println("Enter any month(1 to 12)");
		    Scanner s = new Scanner(System.in);
		    int entry = s.nextInt();
		      switch (entry)
		        {
		            case 12:
		            case 1:
		            case 2:
		            System.out.println("It's Winter.....");
		            break;
		            case 3:
		            case 4:
		            case 5:
		            System.out.println("It's Spring.....");
		            break;
		            case 6:
		            case 7:
		            case 8:
		            System.out.println("It's Summer.....");
		            break;
		            case 9:
		            case 10:
		            case 11:
		            System.out.println("It's Autumn.....");
		            break;
		            default:
		            System.out.println("Invalid...");
		       }
		        
	}

}
