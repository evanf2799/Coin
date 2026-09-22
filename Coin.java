public class Coin {
    private String state;
    public String getState() {
        return state;
    }
    public void flip() {
        if(Math.random() < 0.5) {
            state = "heads";
        } else {
            state = "tails";
        }
    }
}