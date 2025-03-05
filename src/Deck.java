import java.util.*;

//Class representing a Deck of Playing cards
class Deck {
    ArrayList<Card> deck; //List to Store the deck of cards
    Random random; //Random Object for Shuffling and Dealing

    //Constructor to initialise deck and random object
    public Deck() {
        deck = new ArrayList<>();
        random = new Random();  // Initializing random object
    }

    //Method to create a Standard deck fo 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                //Adding Each Card to deck
                deck.add(new Card(rank, suit));
            }
        }
    }

    //method to print all cards in deck
    public void printDeck() {
        for (Card card : deck) {
            //Calling Print Method of Card Class
            card.printCard();
        }
    }

    //method to find a Specific Card in deck
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    //Method to Shuffle the Deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Card Deck shuffled successfully.");
    }

    //Method to compare Two Cards to check if they have the Same ranks
    public void compareCard(Card card1, Card card2) {
        if (card1.sameRank(card2)) {
            System.out.println("The cards have the same rank.");
        } else {
            System.out.println("The cards have different ranks.");
        }
    }
    //method to check if two cards are from same suit
    public void sameCard(Card card1, Card card2) {
        if (card1.sameSuit(card2)) {
            System.out.println(" The cards are from the same suit.");
        } else {
            System.out.println(" The cards are from different suits.");
        }
    }

    // Method to Deal 5 Random Cards from deck
    public void dealCard() {
        if (deck.size() < 5) {
            //Checking if enough cards are left in deck
            System.out.println("Not enough cards left in the deck!");
            return;
        }

        System.out.println("Dealing 5 random cards:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            //Selecting a Random card from deck
            Card card = deck.get(rand.nextInt(deck.size()));
            //printing the Selected card
            card.printCard();
        }
    }
}