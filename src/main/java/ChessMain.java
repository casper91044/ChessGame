public class ChessMain {
    public static void main(String[] args) {
        Player whitePlayer = new Player("Beth Harmon", "beth@mail.ru", true,
                2000, 20);

        Player blackPlayer = new Player("Vasily Borgov", "borgov@mail.ru", false,
                2500, 45);

        System.out.println(" The Player1 name is " + whitePlayer.getName());
        System.out.println(" The Player2 name is " + blackPlayer.getName());

        System.out.println(whitePlayer);
        System.out.println(blackPlayer);


    }
}
