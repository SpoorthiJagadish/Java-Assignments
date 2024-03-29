import java.util.*;
//MAKING THE MAIN CLASS WHICH WILL IMPLEMENT THE CODE
public class
        Main {
    public static void main(String[] args)
    {
        //CREATING SCANNER CLASS WHICH PERFORMS THE JOB OF SCANING VARIABLES ONE AFTER THE OTHER
        Scanner scanner = new Scanner(System.in);

        //USING VECTOR METHOD FOR CREATING THE DECK
        Vector<Card> deck = Card.createDeck();
        int choice;
        do
        {
            System.out.println("1. Print the deck");
            System.out.println("2. Deal cards");
            System.out.println("3. Sort the deck");
            System.out.println("4. Search for a card");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                //SWITCH CASE FOR MULTIPLE INPUTS AND TRANSFERRING FROM ONE METHOD TO ANOTHER
                case 1:
                    Card.printDeck(deck);
                    break;
                case 2:
                    int numCards = scanner.nextInt();
                    Card.dealCards(deck, numCards);
                    break;
                case 3:
                    Card.sortDeck(deck);
                    System.out.println("Deck sorted!");
                    break;
                case 4:
                    System.out.println("Enter the rank of the card (0-12): ");
                    int rank = scanner.nextInt();
                    System.out.println("Enter the suit of the card (0-3): ");
                    int suit = scanner.nextInt();
                    Card card = new Card(rank, suit);
                    int index = Card.findCard(deck, card);
                    if (index == -1) {
                        System.out.println("Card not found in the deck!");
                    } else {
                        System.out.println("Card found at index " + index + " in the deck.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 0);
        scanner.close();
    }
}