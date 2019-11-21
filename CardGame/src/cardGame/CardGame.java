package cardGame;
import java.util.Random;

public class CardGame {

	public static void main(String[] args) 
	{
		int [] myHand = new int [5];
		int [] yourHand = new int [5];
		String mySuit = " ";
		String yourSuit = " ";
		Random generator = new Random();
		int card =0;
		int countH=0;
		int countD=0;
		int countC=0;
		int countS=0;
		//Step 2
		for(int i=0; i<5; i++) 
		{
		card = 1+generator.nextInt(52);
		myHand[i]= card;
		//System.out.println("mine" + " " + myHand[i]);
		card = 1+generator.nextInt(52);
		yourHand[i]= card;
		//System.out.println("yours" + " " + yourHand[i]);
		}
		//STEP 3
		for (int j=0; j<5; j++)
		{
			if (myHand[j] >= 1 && myHand[j]<= 13) {countH=countH+1;}
			else if (myHand[j]>= 14 && myHand[j] <= 26) {countD=countD+1;}
			else if (myHand[j]>= 27 && myHand[j] <= 39) {countC=countC+1;}
			else if (myHand[j]>= 40 && myHand[j] <= 52) {countS=countS+1;}
		
			if (yourHand[j] >= 1 && yourHand[j]<=13) {countH=countH+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) {countD=countD+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) {countD=countD+1;}
			else if (yourHand[j]>= 14 && yourHand[j] <= 26) {countD=countD+1;}
		}
		
		System.out.println("MyHand has 5 cards");
		System.out.println("YourHand has 5 cards");
	}

}
