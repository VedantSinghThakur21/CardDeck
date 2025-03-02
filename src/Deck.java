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

    //Find a Specific Card
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    //Shuffle the Deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Card Deck shuffled successfully.");
    }

    // Compare Two Cards having Same Rank or
    public void compareCard(Card card1, Card card2) {
        if (card1.sameRank(card2)) {
            System.out.println("The cards have the same rank.");
        } else {
            System.out.println("The cards have different ranks.");
        }
    }
}