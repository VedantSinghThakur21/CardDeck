import java.util.*;

class Card {
    String rank;
    String suit;

    public Card(String rank, String suit){ //Constructor
        this.rank = rank;
        this.suit = suit;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

}
