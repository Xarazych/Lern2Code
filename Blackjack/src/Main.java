import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /**Create list of all available cards in a deck, pull two random cards for each player without duplication, assign values for each card drawn.
        Add more cards (values) to player totals, player with highest score <= 21 pts is winner. >= 22 pts is instant loss. Dealer draws another card
         when their score is <= 16. After number of cards left in deck is <= 20 at end of round, deck is reshuffled and all cards are added back to
         available list.**/

        Stack<String> deck = new Stack<>();
        String[] faces = {"A", "J", "Q", "K"};

        for(int i = 2; i <= 10; i++){
            String value = String.valueOf(i);
            String cardClubs = value + "-C";
            String cardDiamonds = value + "-D";
            String cardHearts = value + "-H";
            String cardSpades = value + "-S";
            deck.add(cardClubs);
            deck.add(cardDiamonds);
            deck.add(cardHearts);
            deck.add(cardSpades);

        }
        for (int i = 0; i < faces.length; i++){
            String value = faces[i];
            String cardClubs = value + "-C";
            String cardDiamonds = value + "-D";
            String cardHearts = value + "-H";
            String cardSpades = value + "-S";
            deck.add(cardClubs);
            deck.add(cardDiamonds);
            deck.add(cardHearts);
            deck.add(cardSpades);
        }

        System.out.println(deck);

        Collections.shuffle(deck);

        System.out.println(deck);
    }
}