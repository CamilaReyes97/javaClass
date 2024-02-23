import java.util.Random;

public class HiLowGame {

    public static void main(String[] args) {

        Random random = new Random();


        int player1Card = drawCard(random);
        int player2Card = drawCard(random);


        System.out.println("Player 1 draws: " + cardName(player1Card));
        System.out.println("Player 2 draws: " + cardName(player2Card));


        if (player1Card > player2Card) {
            System.out.println("Player 1 wins!");
        } else if (player2Card > player1Card) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }


    private static int drawCard(Random random) {
        // Cards are in the range 2 to 14
        return random.nextInt(13) + 2;
    }


    private static String cardName(int cardValue) {
        switch (cardValue) {
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            case 14: return "Ace";
            default: return String.valueOf(cardValue);
        }
    }
}
