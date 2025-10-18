/**
 * @author Grace-lilie Acheampong
 * @since April 23, 2025
 * @class CSE 007, Homework 7
 * @IDE Java, VS Code
 * @Descr: a single-player Blackjack game against a dealer.
 */

 import java.util.Scanner;

 public class BlackJack {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         boolean playAgain = true;
 
         while (playAgain) {
             // Create and display deck
             Deck deck = new Deck();
             System.out.println("The unshuffled deck: ");
             System.out.println(deck);
 
             // Shuffling deck
             deck.shuffle();
             System.out.println();
             System.out.println("The shuffled deck: ");
             System.out.println(deck);
 
             // Create hands with capacity for 10 cards
             Hand player = new Hand(10);
             Hand dealer = new Hand(10);
 
             // Deal 2 cards to each
             player.addCard(deck.dealCard());
             player.addCard(deck.dealCard());
             dealer.addCard(deck.dealCard());
             dealer.addCard(deck.dealCard());
 
             // create turn for player
             boolean userTurn = true;
             while (userTurn) {
                 System.out.println("\nYour Hand: " + player);
                 System.out.println("Hand Value: " + player.getValue());
 
                 if (player.getValue() >= 21) {
                     userTurn = false;
                     break;
                 }
 
                 System.out.print("Would you like to hit? (y/n): ");
                 String choice = input.nextLine().toLowerCase();
 
                 // Input validation
                 while (!choice.equals("y") && !choice.equals("n")) {
                     System.out.print("Invalid input. Please type 'y' or 'n': ");
                     choice = input.nextLine().toLowerCase();
                 }
 
                 if (choice.equals("y")) {
                     player.addCard(deck.dealCard());
                 } else {
                     userTurn = false;
                 }
             }
 
             // creating dealer's turn
             System.out.println("Dealer's Hand (before hitting): " + dealer);
             System.out.println("Hand Value: " + dealer.getValue());
             
             while (dealer.getValue() < 17) {
                 System.out.println("Hitting...");
                 dealer.addCard(deck.dealCard());
                 System.out.println("Dealer Hand: " + dealer);
                 System.out.println("Hand Value: " + dealer.getValue());
             }
 
             // finding the winner
             int userVal = player.getValue();
             int dealerVal = dealer.getValue();
 
             System.out.println("\nResults: ");
             System.out.println("User Hand Value: " + userVal);
             System.out.println("Dealer Hand Value: " + dealerVal);
 
             if (dealerVal == 21) {
                 System.out.println("Dealer wins with a Blackjack!");
             } else if (userVal > 21) {
                 System.out.println("You busted! Dealer wins.");
             } else if (dealerVal > 21) {
                 System.out.println("Dealer busted! You win.");
             } else if (dealerVal > userVal) {
                 System.out.println("Dealer wins.");
             } else if (userVal > dealerVal) {
                 System.out.println("You win!");
             } else {
                 System.out.println("It's a tie.");
             }
 
             // prompting user to play again or not
             System.out.print("Do you want to play again? (yes/no): ");
             String again = input.nextLine().toLowerCase();
             while (!again.equals("yes") && !again.equals("no")) {
                 System.out.print("Invalid input. Please type 'yes' or 'no': ");
                 again = input.nextLine().toLowerCase();
             }
             playAgain = again.equals("yes");
         }
 
         System.out.println("Goodbye");
         input.close();
     }
 }