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
        Stack<String> playerHand = new Stack<>();
        Stack<String> dealerHand = new Stack<>();
        String[] faces = {"A", "J", "Q", "K"};
        String cardRank;
        int playerPts = 0;
        int dealerPts = 0;

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
        System.out.println("Shuffling...");
        Collections.shuffle(deck);

        //System.out.println(deck);

        System.out.println("The first card in your hand is: " + deck.peek());
        playerHand.add(deck.pop());
        System.out.println("The first card in the dealer's hand is: " + deck.peek());
        dealerHand.add(deck.pop());
        System.out.println("The second card in your hand is: " + deck.peek());
        playerHand.add(deck.pop());
        System.out.println("The second card in the dealer's hand is unknown.");
        dealerHand.add(deck.pop());
        System.out.println("Your current hand: " + playerHand);
        System.out.println("Hit (h) or Stand (s)?");

        for (int i = 0; i < playerHand.size(); i++){
           cardRank = playerHand.get(i).toString();
           char rank = cardRank.charAt(0);
           int ptValue;

            if (rank == 'A'){
                ptValue = 11;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '2'){
                ptValue = 2;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '3'){
                ptValue = 3;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '4'){
                ptValue = 4;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '5'){
                ptValue = 5;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '6'){
                ptValue = 6;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '7'){
                ptValue = 7;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '8'){
                ptValue = 8;
                //System.out.println("the card value is: " + ptValue);
            }else if (rank == '9'){
                ptValue = 9;
                //System.out.println("the card value is: " + ptValue);
            }else{
                ptValue = 10;
                //System.out.println("the card value is: " + ptValue);
            }
            playerPts = playerPts + ptValue;
        }
        System.out.println("Your hand total is: " + playerPts);
    }
}

