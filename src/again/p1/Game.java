package again.p1;

import jdk.jfr.Description;

@Description("PEAK")
public class Game extends Article{
    int numPlayers;


    @Override
    public void showInfo(){
        super.showInfo();
        System.out.print(" " + getNumPlayers() + "\n");
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
