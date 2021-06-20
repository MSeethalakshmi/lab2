package part2;
import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int limit, i;
        
        
        Scanner in = new Scanner(System.in);
        
     
        System.out.print("Enter the limit range:");
        limit = in.nextInt();
        
      
        System.out.println("Even numbers:");
        
       
        for(i=1; i<=limit; i++){
            
   
            if(i % 2 == 0)
                System.out.println(i);
	}

}
}
