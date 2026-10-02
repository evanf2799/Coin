import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    private Scanner s = new Scanner(System.in);
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your initial balance is: " + player.getBalance());
    }
    public void play() {
        int risk = getRisk();
        System.out.println("Heads or tails?");
        String guess = s.next().toLowerCase();
        boolean correct = player.flip(coin, guess, risk);
        int balance = player.getBalance();
        if (correct) {
            System.out.println("Congrats! Your balance is: " + balance);
        } else {
                System.out.println("Sorry! Your balance is: " + balance);
        }
        if (balance > 0) {
            play();
        } else {
            System.out.println("GAME OVER");
            s.close();
        }
    }
    private int getRisk() {
        System.out.println("How much would you like to risk?");
        int risk = s.nextInt();
        if (risk <= player.getBalance()) {
            return risk;
        } else {
            System.out.println("Your risk exceeds your balance.");
            return getRisk();
        }
    }
}
