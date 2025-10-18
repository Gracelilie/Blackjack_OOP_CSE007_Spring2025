/**
*@author Grace-lilie Acheampong
*@since April 21, 2025 
*@github Grace-lilie
*@class CSE 007, Homework 7
*@IDE Java, VS Code
*@Descr: Represents a hand of cards dealt to a player.
*/

public class Hand {
    private Card[] hand;
    private int numCards;

    public Hand(int size){ // constructor 
        numCards = 0;
        hand = new Card[size];

    }
     // Adding card to the hand
    public void addCard(Card c){
        if (numCards < hand.length){
            hand[numCards] = c;
            numCards++;
        }
    }
    
    // Calculates the value of the hand, treating Ace as 11 if it doesn't bust
    public int getValue(){
        int value = 0;
        int numAces = 0;

        // Calculate base value counting Aces as 1
        for (int i = 0; i < numCards; i++) {
            int rank = hand[i].getRank();
            if (rank == 0) { // Ace
                value += 1;
                numAces++;
            } else if (rank >= 10) { // Face cards
                value += 10;
            } else {
                value += rank + 1; // +1 because rank is 0-12
            }
        }

        // Try using Aces as 11 if it helps
        if (numAces > 0 && value + 10 <= 21) {
            value += 10;
        }

        return value;
    }



    // Override toString to print the entire hand
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < numCards; i++) {
            output += hand[i].toString();
            if (i != numCards - 1) {
                output += ", ";
            }
        }
        return output;
    }

}

