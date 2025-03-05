import java.util.*;


//Class representing a single playing Card
class Card {
    String rank; //Stores the Rank of Card
    String suit; //Stores the Suit of Card

    //Constructor to Initialise the card with a specific rank and suit
    public Card(String rank, String suit){
        this.rank = rank; //assigns given rank to the card
        this.suit = suit; //Assigns given suit to the card
    }

    // Getter method to get the suit of card
    public String getSuit() {
        return suit;
    }

    //Getter method to get the rank of the card
    public String getRank() {
        return rank;
    }

    // method to check if two cards have the same rank
    public boolean sameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    //method to check if two cards have same suit
    public boolean sameSuit(Card other) {
        return this.suit.equalsIgnoreCase(other.suit);
    }

    //method to print all details of a card
    public void printCard() {
        System.out.println(rank + " of " + suit); //Prints the card in "Rank of Suit" Format
    }

}
