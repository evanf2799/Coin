public class Main {
    public static void main(String[] args) {
        Coin penny = new Coin();
        Player mrHolmer = new Player(100);
        mrHolmer.flip(penny, "tails", 50);
        System.out.println(mrHolmer.getBalance());
    }
}