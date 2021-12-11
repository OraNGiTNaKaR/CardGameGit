public class Card {

    private int cardNum;
    private Suit suit;
    private String cardPicture;

    public int getCardNum() {
        return cardNum;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getCardPicture() {
        return cardPicture;
    }

    public Card(int cardNum, Suit suit, String cardPicture) {
        this.cardNum = cardNum;
        this.suit = suit;
        this.cardPicture = cardPicture;
    }

    public int compare(Card other) {
        if (cardNum < other.cardNum)
            return -1;
        if (cardNum > other.cardNum)
            return 1;
        if (cardNum == other.cardNum)
            return 0;


    }

    public String toString() {
        return cardPicture + " of " + suit;
    }
}


