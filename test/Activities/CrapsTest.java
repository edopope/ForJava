package Activities;

import ClassActivities.Craps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrapsTest {
    @Test
    public void CrapsWonTestForNumber7() {
        Craps craps1 = new Craps();
        craps1.sum = 7;
        Assertions.assertSame(craps1.getGameStatus(), craps1.gameStatus.WON);
    }


    @Test
    public void CrapsWonTestForNumber11() {
        Craps craps1 = new Craps();
        craps1.sum = 11;
        Assertions.assertSame(craps1.getGameStatus(), craps1.gameStatus.WON);


    }
    @Test
    public void CrapsLoseForNumbers(){
        Craps craps1 = new Craps();
        craps1.sum = 3;
        Assertions.assertSame(craps1.getGameStatus(), craps1.gameStatus.LOSE);


    }

    @Test
    public void CrapsMyPoint(){
        Craps craps1 = new Craps();
        craps1.sum = 9;
        Assertions.assertEquals(craps1.getGameStatus(),craps1.gameStatus.CONTINUE);
    }

    }

