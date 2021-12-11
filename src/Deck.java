public class Deck {
    private Card[] deckCards;

    public Deck(boolean isEmpty) {
        Card[] deckCards = new Card[52];
        if (isEmpty) {
            for (int i = 0; i <= 51; i++) {
                Suit shape = null;
                if (i >= 0 && i <= 12)
                    shape = Suit.SPADES;
                if (i >= 13 && i <= 25)
                    shape = Suit.DIAMONDS;
                if (i >= 26 && i <= 39)
                    shape = Suit.CLUBS;
                if (i >= 40 && i <= 52)
                    shape = Suit.HEARTS;
                for (int j = 1; j <= 13; j++) {
                    if (j > 0 && j <= 10) {
                        deckCards[i] = new Card(j, shape, "" + j + "");
                        i++;
                    }
                    if (j == 1) {
                        deckCards[i] = new Card(j, shape, "Ace");
                        i++;
                    }
                    if (j == 11) {
                        deckCards[i] = new Card(j, shape, "Jack");
                        i++;
                    }
                    if (j == 12) {
                        deckCards[i] = new Card(j, shape, "Queen");
                        i++;
                    }
                    if (j == 13) {
                        deckCards[i] = new Card(j, shape, "King");
                        i++;
                    }
                }
            }
        }
    }

    public void addCard(Card card) {
        for (int i = 0; i < deckCards.length; i++)
            if (deckCards[i] == null)
                deckCards[i] = card;
    }

    public Card removeTopCard() {
        Card removedCard = null;
        for (int i = 0; i < deckCards.length; i++) {
            if (i == deckCards.length - 1 && deckCards[i] != null) {
                removedCard = deckCards[i];
                deckCards[i] = null;
            }
            if (deckCards[i] != null && deckCards[i + 1] == null) {
                removedCard = deckCards[i];
                deckCards[i] = null;
            }
        }
        return removedCard;
    }

    public boolean isEmpty() {
        boolean isEmpty = true ;
        for (int i = 0; i < deckCards.length; i++) {
            if (deckCards[i] != null)
                isEmpty= false;
        }
        return isEmpty;
    }

    public void shuffle() {

    }

}
