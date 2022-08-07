import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");
        /**Create list of all available cards in a deck, pull two random cards for each player without duplication, assign values for each card drawn.
         Add more cards (values) to player totals, player with the highest score <= 21 pts is winner. >= 22 pts is instant loss. Dealer draws another card
         when their score is <= 16. After number of cards left in deck is <= 15 at end of round, deck is reshuffled and all cards are added back to
         available list.**/

        Scanner hitStand = new Scanner(System.in);
        Stack<String> deck = new Stack<>();
        Stack<String> discard = new Stack<>();
        String[] faces = {"A", "J", "Q", "K"};

        for (int i = 2; i <= 10; i++) {
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
        for (int i = 0; i < faces.length; i++) {
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
        do {
            Stack<String> playerHand = new Stack<>();
            Stack<String> dealerHand = new Stack<>();
            Stack<String> hit = new Stack<>();
            String cardRank;
            int playerPts = 0;
            int dealerPts = 0;
            boolean cRed = false;
            boolean dRed = false;
            boolean hRed = false;
            boolean sRed = false;




            System.out.println("Shuffling...");
            Collections.shuffle(deck);

            Thread.sleep(1500);
            System.out.println("The first card in your hand is: " + deck.peek());
            playerHand.add(deck.pop());
            Thread.sleep(250);
            System.out.println("The first card in the dealer's hand is: " + deck.peek());
            dealerHand.add(deck.pop());
            Thread.sleep(250);
            System.out.println("The second card in your hand is: " + deck.peek());
            playerHand.add(deck.pop());
            Thread.sleep(250);
            System.out.println("The second card in the dealer's hand is unknown.");
            dealerHand.add(deck.pop());
            Thread.sleep(250);
            System.out.println();
            System.out.println("Your current hand: " + playerHand);

            //Player initial hand points
            for (int i = 0; i < playerHand.size(); i++) {
                cardRank = playerHand.get(i);
                char rank = cardRank.charAt(0);
                int ptValue;

                if (rank == 'A') {
                    ptValue = 11;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '2') {
                    ptValue = 2;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '3') {
                    ptValue = 3;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '4') {
                    ptValue = 4;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '5') {
                    ptValue = 5;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '6') {
                    ptValue = 6;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '7') {
                    ptValue = 7;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '8') {
                    ptValue = 8;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '9') {
                    ptValue = 9;
                    //System.out.println("the card value is: " + ptValue);
                } else {
                    ptValue = 10;
                    //System.out.println("the card value is: " + ptValue);
                }
                playerPts = playerPts + ptValue;
            }
            //Dealer initial hand points
            for (int i = 0; i < dealerHand.size(); i++) {
                cardRank = dealerHand.get(i);
                char rank = cardRank.charAt(0);
                int ptValue;

                if (rank == 'A') {
                    ptValue = 11;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '2') {
                    ptValue = 2;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '3') {
                    ptValue = 3;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '4') {
                    ptValue = 4;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '5') {
                    ptValue = 5;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '6') {
                    ptValue = 6;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '7') {
                    ptValue = 7;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '8') {
                    ptValue = 8;
                    //System.out.println("the card value is: " + ptValue);
                } else if (rank == '9') {
                    ptValue = 9;
                    //System.out.println("the card value is: " + ptValue);
                } else {
                    ptValue = 10;
                    //System.out.println("the card value is: " + ptValue);
                }
                dealerPts = dealerPts + ptValue;
            }
            System.out.println("Your hand has " + playerPts + " points in it.");

            String hs;
            do {
                System.out.println("Hit (h) or Stand (s)?");
                hs = hitStand.next().toLowerCase().substring(0, 1);
                if (hs.equals("h")) {
                    System.out.println("Hit.");
                    System.out.println(" ");
                    hit.add(deck.pop());
                    System.out.println("Your next card is: " + hit.peek());

                    for (int i = 0; i < hit.size(); i++) {
                        cardRank = hit.get(i);
                        char rank = cardRank.charAt(0);
                        int ptValue;

                        if (rank == 'A') {
                            ptValue = 11;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '2') {
                            ptValue = 2;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '3') {
                            ptValue = 3;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '4') {
                            ptValue = 4;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '5') {
                            ptValue = 5;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '6') {
                            ptValue = 6;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '7') {
                            ptValue = 7;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '8') {
                            ptValue = 8;
                            //System.out.println("the card value is: " + ptValue);
                        } else if (rank == '9') {
                            ptValue = 9;
                            //System.out.println("the card value is: " + ptValue);
                        } else {
                            ptValue = 10;
                            //System.out.println("the card value is: " + ptValue);
                        }
                        playerPts = playerPts + ptValue;
                    }
                    playerHand.add(hit.pop());

                    //Scan hand for Aces if score over 21, reduce score by 10 and set flag for that ace to indicate it was already reduced.

                    if (playerPts > 21) {
                        if (playerHand.contains("A-C") && !cRed) {
                            playerPts = playerPts - 10;
                            cRed = true;
                        } else if (playerHand.contains("A-D") && !dRed) {
                            playerPts = playerPts - 10;
                            dRed = true;
                        } else if (playerHand.contains("A-H") && !hRed) {
                            playerPts = playerPts - 10;
                            hRed = true;
                        } else if (playerHand.contains("A-S") && !sRed) {
                            playerPts = playerPts - 10;
                            sRed = true;
                        }
                    }

                    System.out.println("Your current hand is: " + playerHand);
                    System.out.println("Your hand has " + playerPts + " points in it.");


                } else if (hs.equals("s")) {
                    System.out.println("Standing on " + playerPts + ".");

                }
            } while (!hs.equals("s") && playerPts < 21);
            Thread.sleep(1500);
            System.out.println();
            System.out.println();
            //Dealer only plays while player has not gone over 21.
            System.out.println("Dealer hand is: " + dealerHand);
            System.out.println("Dealer points total is: " + dealerPts);
            while (dealerPts < 17 && playerPts <= 21 && dealerPts < playerPts) {
                Thread.sleep(750);
                hit.add(deck.pop());
                System.out.println("Dealer's next card is: " + hit.peek());

                for (int i = 0; i < hit.size(); i++) {
                    cardRank = hit.get(i);
                    char rank = cardRank.charAt(0);
                    int ptValue;

                    if (rank == 'A') {
                        ptValue = 11;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '2') {
                        ptValue = 2;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '3') {
                        ptValue = 3;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '4') {
                        ptValue = 4;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '5') {
                        ptValue = 5;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '6') {
                        ptValue = 6;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '7') {
                        ptValue = 7;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '8') {
                        ptValue = 8;
                        //System.out.println("the card value is: " + ptValue);
                    } else if (rank == '9') {
                        ptValue = 9;
                        //System.out.println("the card value is: " + ptValue);
                    } else {
                        ptValue = 10;
                        //System.out.println("the card value is: " + ptValue);
                    }
                    dealerPts = dealerPts + ptValue;
                }
                dealerHand.add(hit.pop());
                if (dealerPts > 21) {
                    if (dealerHand.contains("A-C") && !cRed) {
                        dealerPts = dealerPts - 10;
                        cRed = true;
                    } else if (dealerHand.contains("A-D") && !dRed) {
                        dealerPts = dealerPts - 10;
                        dRed = true;
                    } else if (dealerHand.contains("A-H") && !hRed) {
                        dealerPts = dealerPts - 10;
                        hRed = true;
                    } else if (dealerHand.contains("A-S") && !sRed) {
                        dealerPts = dealerPts - 10;
                        sRed = true;
                    }
                }
            }
            System.out.println("Dealer's final point total is: " + dealerPts);
            System.out.println(" ");
            String winner = ((playerPts > dealerPts && playerPts <= 21) || dealerPts > 21) ? "You win!" : "Dealer wins.";
            System.out.println(winner);
            System.out.println();
            discard.addAll(playerHand);
            discard.addAll(dealerHand);
            playerHand.clear();
            dealerHand.clear();
            if (deck.size() <= 15){
                deck.addAll(discard);
                discard.clear();
            }
            System.out.println("Play again? y/n");
        }while(hitStand.next().toLowerCase().charAt(0) != 'n');
    }
}
