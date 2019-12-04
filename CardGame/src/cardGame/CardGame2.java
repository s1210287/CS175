package cardGame;
import java.util.Random;

public class CardGame2 {

	public static void main(String[] args) 
	{
		int [] myHand = new int [5];
		int [] yourHand = new int [5];
		String mySuit = " ";
		String yourSuit = " ";
		String draw = " ";
		Random generator = new Random();
		int card =0;
		int countH=0;
		int countD=0;
		int countC=0;
		int countS=0;
		boolean winner = false;
		//Step 2
		for(int i=0; i<5; i++) 
		{
		card = 1+generator.nextInt(52);
		myHand[i]= card;
		System.out.println("My hand: " + myHand[i]);
		card = 1+generator.nextInt(52);
		yourHand[i]= card;
		System.out.println("Your hand: " + yourHand[i]);
		}
		//STEP 3
		for (int j=0; j<5; j++)
		{
			if (myHand[j] >= 1 && myHand[j]<= 13) 
			{countH=countH+1;} //countH++;
			else if (myHand[j]>= 14 && myHand[j] <= 26) 
			{countD=countD+1;}
			else if (myHand[j]>= 27 && myHand[j] <= 39) 
			{countC=countC+1;}
			else if (myHand[j]>= 40 && myHand[j] <= 52) 
			{countS=countS+1;}
		
		
		if(countH>countD && countH>countC && countH>countS)
			mySuit = "Hearts";
		else if (countD>countH && countD>countC && countD>countS)
			mySuit = "Diamonds";
		else if (countC>countD && countS>countC && countS>countH)
			mySuit = "Clubs";
		else if (countS>countD && countS>countC && countS>countH)
			mySuit = "Spades";
		
		countH =0;
		countD = 0;
		countC = 0;
		countS =0;
			
		//for (int j=0; j<5; j++)
		
			if (yourHand[j] >= 1 && yourHand[j]<=13) 
			{countH=countH+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) 
			{countD=countD+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) 
			{countC=countC+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) 
			{countS=countS+1;}
		}
		
		if(countH>countD && countH>countC && countH>countS)
			yourSuit = "Hearts";
		else if (countD>countH && countD>countC && countD>countS)
			yourSuit = "Diamonds";
		else if (countC>countD && countS>countC && countS>countH)
			yourSuit = "Clubs";
		else if (countS>countD && countS>countC && countS>countH)
			yourSuit = "Spades";
		
		System.out.println("MyHand has 5 cards");
		System.out.println("YourHand has 5 cards");
		System.out.println("My suit: " + mySuit);
		System.out.println("Your suit: " + yourSuit);
	
		while(winner=false) 
		{
			card = 1+generator.nextInt(52);
			if(card>= 1 && card <=13)
				draw = "Hearts";
			else if (card>=14 && card <=26)
				draw = "Diamonds";
			else if (card>27 && card <=39)
				draw = "Clubs";
			else if (card >40 && card <=52)
				draw = "Spades";
			
		//System.out.print(card);
		
		
		}
		
		
	}

}
