import java.util.*;

class Deck {
    ArrayList<Card> deck;
    Random random;

    public Deck() {
        deck = new ArrayList<>();
        random = new Random();  // Initializing random
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}