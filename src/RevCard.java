
public class RevCard extends Card{
public static void main(String[] args) {
		
		String[] Suits = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] Ranks = {"Clover", "Spade", "Heart", "Diamond"};
		
		int n = Suits.length*Ranks.length;
		String deck[] = new String[n];
		
		for (int i = n-1 ; i < Ranks.length; i--) {
            for (int j = n-1; j < Suits.length; j--) {
                deck[Suits.length*i + j] = Ranks[i] + " " + Suits[j];
            }
        }
		
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}
	}
}
