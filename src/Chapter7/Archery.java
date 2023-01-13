package Chapter7;

public class Archery {
private Player[] players;
    //int numberOfGamePlayer;
public Archery(int numberOfGamePlayer){
    players = new Player[numberOfGamePlayer];
    for (int i = 0; i < numberOfGamePlayer ; i++) {
        players[i] = new Player();
    }
}
    public Player[] getPlayers() {
        return players;
    }
  //  private void addPlayers(){
    // }
}
