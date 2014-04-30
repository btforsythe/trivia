package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

/**
 * Created by adi on 4/30/14.
 */
public class GoldenMaster {

    public static final int MAX_SEED = 1000;

    public String getGameResult(long seed){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);

        GameRunner.play(new Random(seed));

        return stream.toString();
    }

    public void generateGoldenMaster() throws IOException {
        for(long seed=0; seed < MAX_SEED; seed++){
            FileUtils.write(new File("goldenMasterData/" + seed + ".txt"), getGameResult(seed));
        }
    }

    public String getGoldenMaster(long seed) throws IOException{
        return FileUtils.readFileToString(new File("goldenMasterData/" + seed + ".txt"));
    }
}
