package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryTest {
    @Test
    public void testThatGameExist(){
        Archery game = new Archery(3);
        assertNotNull(game);
    }
@Test
    public void testThatPlayerCanBeCreated(){
        Player player = new Player();
        assertNotNull(player);

}
@Test
    public void testThatPlayersCanExistInTheGame(){
        Archery game = new Archery(3);
        Player[] players = game.getPlayers();
       assertNotNull(players);
  assertTrue(players.length > 0);
}
@Test
    public void testThatGameHasPlayer(){
         Archery game = new Archery(3);
    Player[] players = game.getPlayers();
    Player player1 = players[0];
    assertNotNull(player1);
}
}