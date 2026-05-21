package p1;

public class Game extends Article{
    private int numPlayers;
    public int getNumPlayer() {
        return numPlayers;
    }

    public void setNumPlayer(int numPlayers) {
        this.numPlayers = numPlayers;
    }
    public void showInfo(){
        super.showInfo();
        System.out.print(" Maximum number of players: " + numPlayers);
        System.out.println();
    }




}
