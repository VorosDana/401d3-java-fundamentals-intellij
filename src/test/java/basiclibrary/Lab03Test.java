package basiclibrary;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Lab03Test {

    @Test
    public void analyzeWeather() {
        assertTrue(Lab03.analyzeWeather(new int[][]  {{66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}}).equals(
                            "High: 72\n" +
                            "Low: 51\n" +
                            "\n" +
                            "Never saw 63\n" +
                            "Never saw 67\n" +
                            "Never saw 68\n" +
                            "Never saw 69"
        ));
    }

    @Test
    public void testVoting() {
        List<String> votes = new ArrayList<>();
        votes.add("Fred");
        votes.add("Daphne");
        votes.add("Shaggy");
        votes.add("Velma");
        votes.add("Velma");
        votes.add("Shaggy");
        votes.add("Shaggy");
        votes.add("Scooby");
        votes.add("Velma");
        votes.add("Velma");

        assertTrue("Velma".equals(Lab03.tally(votes)));
    }

    @Test
    public void testLinter() {
        System.out.println(Lab03.linter(Paths.get("./assets/gates.sh")));
    }
}