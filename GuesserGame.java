import java.util.Scanner;

class Guesser {
    int guesserNum;

    public int takeNumberGuesser() {
        System.out.println("Guesser, guess a Number:");
        Scanner sc = new Scanner(System.in);
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}

class Player {
    int playerNum;

    public int takeNumberPlayer(int playerNumber) {
        System.out.println("Player " + playerNumber + ", guess a Number:");
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        return playerNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.takeNumberGuesser();
    }

    void collectFromPlayers() {
        Player p1 = new Player();
        numFromPlayer1 = p1.takeNumberPlayer(1);

        Player p2 = new Player();
        numFromPlayer2 = p2.takeNumberPlayer(2);

        Player p3 = new Player();
        numFromPlayer3 = p3.takeNumberPlayer(3);
    }

    void compare() {
        if (numFromPlayer1 == numFromGuesser) {
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
                System.out.println("All Players Won The Game");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("Player 1 and Player 2 Won The Game");
            } else if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Player 1 and Player 3 Won The Game");
            } else {
                System.out.println("Player 1 Won The Game");
            }
        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Player 2 and Player 3 Won The Game");
            } else {
                System.out.println("Player 2 Won The Game");
            }
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 3 Won The Game");
        } else {
            System.out.println("No Player Won The Game");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire U = new Umpire();
        U.collectFromGuesser();
        U.collectFromPlayers();
        U.compare();
    }
}
