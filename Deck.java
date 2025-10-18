/**
*@author Grace-lilie Acheampong
*GitHub: @Grace-lilie
*@since April 23, 2025 
*@class CSE 007, Homework 7
*@IDE Java, VS Code
*@Descr: A deck of 52 playing cards with shuffle and deal
*/

import java.util.Random;

public class Deck {
    private Card[] deck = new Card[52];
    private int nextCard;

    public Deck(){
        
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public void shuffle(){
        Random r = new Random();

       int index=0;
       for(int i = 0; i<52; i++){
            index= r.nextInt(52); // generating index for swaps

            Card temp = deck[i];      // swaping the card with a random one
            deck[i] = deck[index];
            deck[index] = temp;
       }
        nextCard = 0;
    }

    public Card dealCard(){
        if (nextCard < 52) {
            return deck[nextCard++]; // increments AFTER returning the current card
        } else {
            return null;  // when all cards are used up
        }

    }

    @Override
    public String toString() {
        String result = "";
    
        for (int i = 0; i < deck.length; i++) {
            result += deck[i] + " "; // overrides toString in cards
        }

        return result;
    }
}
