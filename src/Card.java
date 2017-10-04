import java.util.Random;

public class Card {
	public static void main(String[] args) {
		
		String[] Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] Suits = {"Clover", "Spade", "Heart", "Diamond"};

		int n = Suits.length*Ranks.length;
		String deck[] = new String[n];
		
		for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
            }
        }
		
		System.out.println("Your deck of Cards:");
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}
		
		String randomSuits = (Suits[new Random().nextInt(Suits.length)]);
		String randomRanks = (Ranks[new Random().nextInt(Ranks.length)]);
	    
	    String card1 = randomRanks + " of " + randomSuits;
	    
	    System.out.println("\n");
	    System.out.println("Your random card:");
	    System.out.println("\n");
	    System.out.println(card1);
	}
	
}
