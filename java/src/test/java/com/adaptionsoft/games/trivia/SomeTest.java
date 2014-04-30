package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;
import org.junit.Test;

public class SomeTest {

    @Test
    public void checkTriviaAgainstGoldenMaster() throws Exception{
        GoldenMaster goldenMaster = new GoldenMaster();

        for(long seed = 0; seed< 1000; seed++){
            String expected = goldenMaster.getGoldenMaster(seed);
            String actual = goldenMaster.getGameResult(seed);
            assertEquals(expected, actual);
        }
    }
}