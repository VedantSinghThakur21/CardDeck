// [Name] : Vedant Singh Thakur
// [PRN] : 23070126144
// [Batch] : B3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck();
        int choice;

        do {
            // Display Menu
            System.out.println("\n🔹 Card Deck Menu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Find a Card");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Compare Two Cards (Same Rank)");
            System.out.println("6. Check if Two Cards Have the Same Suit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;

                case 2:
                    System.out.print("Enter Card Suit (Hearts, Diamonds, Clubs, Spades): ");
                    String suit = sc.nextLine();
                    System.out.print("Enter Card Rank (2-10, Jack, Queen, King, Ace): ");
                    String rank = sc.nextLine();
                    deck.findCard(suit, rank);
                    break;

                case 3:
                    deck.dealCard();
                    break;

                case 4:
                    deck.shuffleDeck();
                    break;

                case 5:
                    System.out.print("Enter Suit & Rank of First Card: ");
                    String suit1 = sc.nextLine();
                    String rank1 = sc.nextLine();
                    System.out.print("Enter Suit & Rank of Second Card: ");
                    String suit2 = sc.nextLine();
                    String rank2 = sc.nextLine();
                    deck.compareCard(new Card(suit1, rank1), new Card(suit2, rank2));
                    break;

                case 6:
                    System.out.print("Enter Suit & Rank of First Card: ");
                    String s1 = sc.nextLine();
                    String r1 = sc.nextLine();
                    System.out.print("Enter Suit & Rank of Second Card: ");
                    String s2 = sc.nextLine();
                    String r2 = sc.nextLine();
                    deck.sameCard(new Card(s1, r1), new Card(s2, r2));
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
