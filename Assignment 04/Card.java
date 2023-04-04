import java.util.*;
public class Card
{
    //PRIVATE CONSTRUCTOR WHICH CANNOT BE ACCESSED BY OTHER CLASS
    private int rank;
    private int suit;
    public Card() // Default constructor sets rank and suit to 0
    {
        this.rank = 0;
        this.suit = 0;
    }
    public Card(int rank, int suit)     // Parameterized constructor sets rank and suit to given values

    {
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank()    // Getter methods for rank and suit
    {
        return rank;
    }
    public int getSuit()
    {
        return suit;
    }
    public void printCard()
    {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        System.out.println(ranks[rank] + " of " + suits[suit]);
    }
    public static Vector<Card> createDeck()
    {
        Vector<Card> deck = new Vector<Card>();
        for (int suit = 0; suit < 4; suit++)
        {
            for (int rank = 0; rank < 13; rank++)
            {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }
    public static void printDeck(Vector<Card> deck)
    {
        for (int i = 0; i < deck.size(); i++)
        {
            deck.get(i).printCard();
        }
    }
    public static boolean sameCard(Card c1, Card c2)
    {
        return c1.getRank() == c2.getRank() && c1.getSuit() == c2.getSuit();
    }
    public static int compareCard(Card c1, Card c2)
    {
        if (c1.getRank() < c2.getRank())
        {
            return -1;
        }
        else if (c1.getRank() > c2.getRank())
        {
            return 1;
        }
        else
        {
            return Integer.compare(c1.getSuit(), c2.getSuit());
        }
    }
    public static void sortDeck(Vector<Card> deck)
    {
        Collections.sort(deck, new Comparator<Card>()
        {
            @Override
            public int compare(Card c1, Card c2)
            {
                return compareCard(c1, c2);
            }
        });
    }

    public static int findCard(Vector<Card> deck, Card card)
    {
        for (int i = 0; i < deck.size(); i++)
        {
            if (sameCard(deck.get(i), card))
            {
                return i;
            }
        }
        return -1;
    }
    public static void dealCards(Vector<Card> deck, int numCards)
    {
        Random rand = new Random();
        for (int i = 0; i < numCards; i++) {
            int index = rand.nextInt(deck.size());
            Card card = deck.remove(index);
            card.printCard();
        }
    }
}