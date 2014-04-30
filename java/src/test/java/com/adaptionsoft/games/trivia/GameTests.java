package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTests {

    private Game game;
    @Before
    public void setup(){
        game = new Game();
    }

    private ByteArrayOutputStream getConsoleOutput() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        return stream;
    }

    @Test
    public void whenGameIsCreatedNothingIsWrittenToTheOutput(){
        ByteArrayOutputStream stream = getConsoleOutput();
        String emptyString = "";

        assertEquals(emptyString, stream.toString());
    }

    @Test
    public void whenPlayerIsAddedHisNameAndPlayerNumberIsWritten(){
        ByteArrayOutputStream stream = getConsoleOutput();
        String playerNameAndNumber = "Adi was added\n" +
                "They are player number 1\n";
        String playerName = "Adi";

        game.addPlayerName(playerName);

        assertEquals(playerNameAndNumber, stream.toString());
    }

    @Test
    public void whenTwoPlayersAreAddedTheirNameAndPlayerNumbersAreWritten(){
        ByteArrayOutputStream stream = getConsoleOutput();
        String playerNameAndNumber = "Adi was added\n" +
                "They are player number 1\n" +
                "Alex was added\n" +
                "They are player number 2\n";
        String playerName = "Adi";
        String secondPlayerName = "Alex";

        game.addPlayerName(playerName);
        game.addPlayerName(secondPlayerName);

        assertEquals(playerNameAndNumber, stream.toString());
    }

    @Test
    public void whenRollingDiceMessageAboutDiceAndPlayerLocationAndCategoryIsWrittenToOutput(){
        ByteArrayOutputStream stream = getConsoleOutput();
        game.addPlayerName("SomePlayer");

        game.roll(1);

        assertEquals("SomePlayer was added\n" +
                "They are player number 1\n" +
                "SomePlayer is the current player\n" +
                "They have rolled a 1\n" +
                "SomePlayer's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 0\n", stream.toString());
    }
}