package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SomeTest {

	@Test
	public void true_is_true() throws Exception {
		assertTrue(true);
	}

    @Test
    public void whenGameIsCreatedSomethingHappens(){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);

        Game game = new Game();

        assertEquals("", stream.toString());

    }
}