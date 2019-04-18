package basiclibrary;

import org.junit.Test;

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
}