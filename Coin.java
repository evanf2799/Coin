public class Coin {
    private String state;
    private int heads;
    private int tails;
    private double pTails;
    public Coin(double pt) {
        pTails = pt;
    }
    public Coin() {
        pTails = 0.5;
    }
    public String getState() {
        return state;
    }
    public int getHeads() {
        return heads;
    }
    public int getTails() {
        return tails;
    }
    public void flip() {
        if(Math.random() < pTails) {
            state = "heads";
            heads++;
        } else {
            state = "tails";
            tails++;
        }
    }
    public void flip(int flips) {
        while (flips > 0) {
            flip();
            flips--;
        }
    }
}