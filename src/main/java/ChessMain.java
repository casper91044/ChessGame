import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayer();

        for (Player player: players) {
           System.out.println(player);
        }

        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
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

    public HashMap<String, Piece > createPieces() {
        King whiteKing = new King(new Spot("H", 7),  "white_king", true);
        King blackKing = new King(new Spot("D", 8),  "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("A", 7), "white_rook1", true);
        Rook whiteRook2 = new Rook(new Spot("G", 7), "white_rook2", true);
        Knight blackKnight = new Knight(new Spot("D", 6), "black_knight", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight.getId(), blackKnight);
        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        players.get(0).movePiece(hashMap.get("white_rook1"), new Spot("E", 8));
        players.get(1).movePiece(hashMap.get("black_knight"), new Spot("C", 8));
    }
}
