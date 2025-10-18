# Blackjack_OOP_CSE007_Spring2025
Java 11 Blackjack with Card, Deck, Hand, and Blackjack classes. Models a playable console game with shuffling, dealing, hit or stand flow, and win logic. Demonstrates OOP, state management, and input handling for CSE007 Spring 2025.

# Blackjack OOP — CSE007 Homework 7

Author: Grace-lilie Acheampong  
Course: CSE007 Spring 2025  
Assignment: Homework 7  
Language: Java 11

## Description
This project implements a console Blackjack game using object oriented design.  
Core classes are Card, Deck, Hand, and Blackjack. The game shuffles a deck, deals cards, lets the player hit or stand, handles dealer rules, evaluates scores with ace handling, and announces the result.

## Files
1. Card.java  
   Immutable playing card with rank and suit. Provides value for Blackjack including ace logic support and string formatting.

2. Deck.java  
   Standard 52 card deck. Builds the deck, shuffles, and deals the next card. Can reset when empty if designed to do so.

3. Hand.java  
   Holds a collection of Card objects. Computes total score with proper ace handling, detects busts and blackjack, and prints a readable view.

4. Blackjack.java  
   Game driver. Manages a round, prompts player for actions, executes dealer rules, compares hands, and reports outcome.

## Real World Application
This mirrors how interactive systems separate model, logic, and control.  
Card, Deck, and Hand represent domain entities used in real casino simulators, mobile games, and testing of strategy or probability.  
The Blackjack class is a simple state machine similar to flows in kiosks, checkout systems, and other user driven applications.

## Example Run

