package basiclibrary;

import java.util.HashSet;

public class Lab03 {
    public static void main(String[] args){
        System.out.println(analyzeWeather( new int[][] {{66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}}));
    }

    public static String analyzeWeather(int[][] weatherData) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;

        HashSet<Integer> foundValues = new HashSet<>();

        String output = "";

        for(int[] week : weatherData){
            for(int temp : week){
                foundValues.add(temp);
                if(temp > maxTemp){
                    maxTemp = temp;
                }
                if(temp < minTemp){
                    minTemp = temp;
                }
            }
        }

        output += "High: " + maxTemp;
        output += "\nLow: " + minTemp + "\n";

        // never have to test minTemp or maxTemp, because they are in the set, will never not be present
        for(int i = minTemp + 1; i < maxTemp; i++){
            if(!foundValues.contains(i)){
                output += "\nNever saw " + i;
            }
        }

        return output;
    }
}
