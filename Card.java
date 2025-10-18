/**
*@author Grace-lilie Acheampong
*@since April 21, 2025 
*@class CSE 007, Homework 7
*@IDE Java, VS Code
*@Descr: Generates the exact cards used to play the game
*/

public class Card {
    private int rank=0;
    private int suit=0;

    private static String[] rankName = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suitName = {"C", "H", "S", "D"};

    public Card(){}

    public Card(int rank, int suit ){ // constructor to accept rank and suit from user
        this.rank = rank;
        this.suit = suit;
    }

    public String getRankName(){ // returns the exact card rank with user input in the rankName list 
        return rankName[this.rank];
    }

    public String getSuitName(){ // returns the exact card suit name in the index of suit list
        return suitName[this.suit]; 
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }
    
    @Override
    
    public String toString(){
        return rankName[rank] + suitName[suit]  ;
    }
    



}

