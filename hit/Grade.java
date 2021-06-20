

package hit;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double grade;
double sumofgrade;
int numofstudents;
int numpass;
int numfail;
Scanner scan=new Scanner(System.in);
System.out.println("\n Grade processing\n");
sumofgrade=0;
numofstudents=0;
numpass=0;
numfail=0;

System.out.println("Enter the first student grade: ");
grade=scan.nextDouble();
while(grade>=0) {
	sumofgrade=sumofgrade+1;
	numofstudents=numofstudents+1;
if(grade < 60)
numfail=numfail+1;	
else
	numpass=numpass+1;
System.out.println("Enter the next student grade:(negative to quit) ");
grade=scan.nextDouble();
}
if(numofstudents>0)
{
	System.out.println("Grade summary: \n");
	System.out.println("Class Average: "+sumofgrade/numofstudents);
	System.out.println("Number of students fail grade: " +numfail);
	System.out.println("Number of students pass grade: " +numpass);

	}
else
	System.out.println("No grades processed.....");
	}
}
