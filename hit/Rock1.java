package hit;

import java.util.Scanner;
import java.util.Random;

public class Rock1
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay;  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	                      //computer's play

   Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	
	System.out.println ("Enter R for Rock, P for Paper, S for Scissors: "); //Get player's play -- note that this is stored as a string
	personPlay = scan.next();
	
	personPlay = personPlay.toUpperCase();
	
	computerInt = generator.nextInt(3);
	
	switch (computerInt)
	{
		case 0:
			{
			computerPlay = "R";
			break;
			}
		case 1:
			{
			computerPlay = "P";
			break;
			}
		case 2:
			{
			computerPlay = "S";
			break;
			}
		default:
			{
			computerPlay = "will not happen";
			}	
	}
	
	System.out.println ("Computer plays: " + computerPlay);
	
		if (personPlay.equals(computerPlay))
		{ 
			System.out.println("It's a tie!");
		}
		 
		else if (personPlay.equals("R"))
		{
			if (computerPlay.equals("S"))
			System.out.println("Rock crushes scissors.  You win!!");
	   	else if (computerPlay.equals("P"))
			System.out.println ("Paper eats rock. You lose!!");
		}
		else if (personPlay.equals("P"))
		{
	   	if (computerPlay.equals("S"))
			System.out.println ("Scissor cuts paper. You lose!!");
	   	else if (computerPlay.equals("R"))
			System.out.println ("Paper eats rock. You win!!");
		}
		else if (personPlay.equals("S"))
		{
			if (computerPlay.equals("P"))
			System.out.println ("Scissor cuts paper. You win!!");
			else if (computerPlay.equals("R"))
			System.out.println ("Rock breaks scissors. You lose!!");
		}
		else
		{
			System.out.println ("Invalid user input.");
		}
		
		
	}
}
