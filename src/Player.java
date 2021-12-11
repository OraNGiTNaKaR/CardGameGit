public class Player {
    private String playerName;
    private Deck gameDeck;
    private Deck winDeck;


    public String getPlayerName() {
        return playerName;
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public Deck getWinDeck() {
        return winDeck;
    }

    public Player(String playerName) {
        Deck gameDeck = new Deck(false);
        Deck winDeck = new Deck(false);
    }

    public Card drawCard() {
        return gameDeck.removeTopCard();
    }
    public boolean outOfCards() {
        return gameDeck.isEmpty();
    }
    public String toString() {
        return playerName ;
    }
}
