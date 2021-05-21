import java.util.ArrayList;

public class ChessMain {
    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayer();

        for (Player player: players) {
           System.out.println(player);
        }

        main.createPieces();
    }

    public ArrayList<Player> createPlayer(){
        Player whitePlayer = new Player("Beth Harmon", "beth@mail.ru", true,
                2000, 20);

        Player blackPlayer = new Player("Vasily Borgov", "borgov@mail.ru", false,
                2500, 45);

        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);

        return players;
    }

    public void createPieces() {
        King whiteKing = new King(new Spot("H", 7),  "white_king", true);
        King blackKing = new King(new Spot("D", 8),  "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("A", 7), "white_rook", true);
        Rook whiteRook2 = new Rook(new Spot("G", 7), "white_rook", true);
        Knight blackKnight = new Knight(new Spot("D", 6), "black_knight", false);

        System.out.println(whiteKing);
    }
}
