import java.util.Scanner;
class Guesser
{
	Scanner scan=new Scanner(System.in);
	public int guessNumber()
	{
		System.out.println("Guesser kindly guess the number");
		return scan.nextInt();
	
	}	

}

class Player
{
	Scanner scan=new Scanner(System.in);
	public int guessNumber(String name)
	{
		System.out.println(name+" kindly guess the number");
		return scan.nextInt();
	}
}

class Umpire
{
	
	int numFromGuesser;

	String playerNames[] = new String[3];
	
	int numsFromPlayers[] = new int[3];	
	
	Scanner scan=new Scanner(System.in);
	
	void readingPlayerNames() {
		 
		 for(int i=0;i<3;i++) {
			 System.out.println("Player"+(i+1)+" enter your name:");
			playerNames[i] = scan.next();
		 }
	}
	
	public void collectNumFromGuesser()
	{
		readingPlayerNames();
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer()
	{
		Player p=new Player();
		for(int i=0;i<3;i++) {
			numsFromPlayers[i] = p.guessNumber(playerNames[i]);
		}
	}

	
	void compare()
	{
		
		if(numFromGuesser==numsFromPlayers[0])
		{
			if(numFromGuesser==numsFromPlayers[1] && numFromGuesser==numsFromPlayers[2])
			{
				System.out.println("Congratulations..." +playerNames[0]+" , "+playerNames[1]+" and "+playerNames[2] +" Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numsFromPlayers[1])
			{
				System.out.println("Congratulations..." +playerNames[0]+" and "+playerNames[1] +" won the game.");
			}
			else if(numFromGuesser==numsFromPlayers[2])
			{
				System.out.println("Congratulations..." +playerNames[0]+" and "+playerNames[2] +" won the game.");
			}
			else
			{
			System.out.println("Congratulations....." +playerNames[0] +" you won the game.");
			}
		}
		
		else if(numFromGuesser==numsFromPlayers[1])
		{
			
			if(numFromGuesser==numsFromPlayers[2])
			{
			System.out.println("Congratulations....." +playerNames[1] +" and " +playerNames[2] +" won the game.");
			}
			else
			{
				System.out.println("Congratulations....." +playerNames[1] +" you won the game.");
			}
		}
		
		
		
		else if(numFromGuesser==numsFromPlayers[2])
		{
			System.out.println("Congratulations....." +playerNames[2] +" you won the game.");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}

public class Launchgame {

	public static void main(String[] args) {

		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}