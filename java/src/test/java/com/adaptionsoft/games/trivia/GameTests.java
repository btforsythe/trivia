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

        game.add(playerName);

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

        game.add(playerName);
        game.add(secondPlayerName);

        assertEquals(playerNameAndNumber, stream.toString());
    }

    @Test
    public void whenRollingDiceMessageAboutDiceAndPlayerLocationAndCategoryIsWrittenToOutput(){
        ByteArrayOutputStream stream = getConsoleOutput();
        game.add("SomePlayer");

        game.roll(1);

        assertEquals("SomePlayer was added\n" +
                "They are player number 1\n" +
                "SomePlayer is the current player\n" +
                "They have rolled a 1\n" +
                "SomePlayer's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 0\n", stream.toString());
    }

    @Test
    public void Smth(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(1);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 1\n" +
                "SomePlayer's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 0\n", stream.toString());
    }

    @Test
    public void Smth2(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(2);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 2\n" +
                "SomePlayer's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 0\n", stream.toString());
    }

    @Test
    public void Smth3(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(3);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 3\n" +
                "SomePlayer's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 0\n", stream.toString());
    }

    @Test
    public void Smth4(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(4);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 4\n" +
                "SomePlayer's new location is 4\n" +
                "The category is Pop\n" +
                "Pop Question 0\n", stream.toString());
    }


    @Test
    public void Smth5(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(5);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 5\n" +
                "SomePlayer's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 0\n", stream.toString());
    }

    @Test
    public void Smth6(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(6);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 6\n" +
                "SomePlayer's new location is 6\n" +
                "The category is Sports\n" +
                "Sports Question 0\n", stream.toString());
    }


    @Test
    public void Smth7(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(7);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 7\n" +
                "SomePlayer's new location is 7\n" +
                "The category is Rock\n" +
                "Rock Question 0\n", stream.toString());
    }


    @Test
    public void Smth13(){
        game.add("SomePlayer");
        ByteArrayOutputStream stream = getConsoleOutput();

        game.roll(13);

        assertEquals("SomePlayer is the current player\n" +
                "They have rolled a 13\n" +
                "SomePlayer's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 0\n", stream.toString());
    }
}