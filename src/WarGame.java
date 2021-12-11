public class WarGame {
    private Player playerOne ;
    private Player playerTwo ;
    private Deck mainDeck ;

    public WarGame(String playerNameOne, String playerNameTwo) {
        Player playerOne = new Player(playerNameOne);
        Player playerTwo = new Player(playerNameTwo);
        Deck mainDeck = new Deck(true) ;
    }

    public String start() {
        return "" ;
    }
}
