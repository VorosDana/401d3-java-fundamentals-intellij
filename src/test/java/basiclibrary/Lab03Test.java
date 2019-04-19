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
        assertTrue(Lab03.analyzeWeather(new int[][]{{66, 64, 58, 65, 71, 57, 60},
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
        String actualOutput = Lab03.linter(Paths.get("./assets/gates.sh"));
        String expectedOutput = "Line 3: missing semicolon\n" +
                "Line 5: missing semicolon\n" +
                "Line 11: missing semicolon\n" +
                "Line 13: missing semicolon\n" +
                "Line 15: missing semicolon\n" +
                "Line 26: missing semicolon\n" +
                "Line 28: missing semicolon\n" +
                "Line 32: missing semicolon\n" +
                "Line 36: missing semicolon\n" +
                "Line 40: missing semicolon\n" +
                "Line 41: missing semicolon\n" +
                "Line 50: missing semicolon\n" +
                "Line 51: missing semicolon\n" +
                "Line 64: missing semicolon\n" +
                "Line 70: missing semicolon\n" +
                "Line 71: missing semicolon\n" +
                "Line 72: missing semicolon\n" +
                "Line 73: missing semicolon\n" +
                "Line 74: missing semicolon\n" +
                "Line 76: missing semicolon\n" +
                "Line 77: missing semicolon\n" +
                "Line 78: missing semicolon\n" +
                "Line 79: missing semicolon\n" +
                "Line 80: missing semicolon\n" +
                "Line 82: missing semicolon\n" +
                "Line 83: missing semicolon\n" +
                "Line 84: missing semicolon\n" +
                "Line 85: missing semicolon\n" +
                "Line 86: missing semicolon\n" +
                "Line 88: missing semicolon\n" +
                "Line 89: missing semicolon\n" +
                "Line 90: missing semicolon\n" +
                "Line 91: missing semicolon\n" +
                "Line 92: missing semicolon\n" +
                "Line 94: missing semicolon\n" +
                "Line 95: missing semicolon\n" +
                "Line 96: missing semicolon\n" +
                "Line 97: missing semicolon\n" +
                "Line 98: missing semicolon\n" +
                "Line 99: missing semicolon\n" +
                "Line 100: missing semicolon\n" +
                "Line 101: missing semicolon\n";
        assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void testLinterEmptyFiile() {
        String expectedOutput = "";
        String actualOutput = Lab03.linter(Paths.get("./assets/empty.js"));
        assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void testLinterFewErrors() {
        String expectedOutput = "Line 2: missing semicolon\n" +
                "Line 6: missing semicolon\n";
        ;
        String actualOutput = Lab03.linter(Paths.get("./assets/fewErrors.js"));
        assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void testLinterOneError() {
        String expectedOutput = "Line 2: missing semicolon\n";

        String actualOutput = Lab03.linter(Paths.get("./assets/oneError.js"));
        assertTrue(expectedOutput.equals(actualOutput));
    }

    @Test
    public void testLinterNoErrors() {
        String expectedOutput = "";

        String actualOutput = Lab03.linter(Paths.get("./assets/noErrors.js"));
        assertTrue(expectedOutput.equals(actualOutput));
    }
}