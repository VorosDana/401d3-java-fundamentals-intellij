package basiclibrary;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String tally(List<String> votes) {
        HashMap<String, Integer> votesTally = new HashMap<>();



        for(String vote : votes){
            votesTally.put(vote, votesTally.getOrDefault(vote, 0) + 1);
        }

        String winner = "";
        int maxVotes = -1;

        Set<String> voteNames = votesTally.keySet();

        for(String name : voteNames){
            if(votesTally.get(name) > maxVotes){
                winner = name;
                maxVotes = votesTally.get(name);
            }
        }

        return winner;
    }

    public static String linter(Path path){
        String output = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(path.toString()));

            String currentLine = file.readLine();
//            String regexPattern = "(^.*((if|else).*|({|;|}))\\s*$)|(^\\/\\/)";
            Pattern regex = Pattern.compile("(^.*((if|else).*|(\\{|;|}))\\s*$)|(^//.*)");
//            Matcher matchy = new Matcher();
            int lineNumber = 1;

            while(currentLine != null){
                if(!(currentLine.equals("") || currentLine.matches("(^.*((if|else).*|[\\{;}])\\s*$)|(^\\s*\\/\\/.*)") )){
                    output+= "Line " + lineNumber + ": missing semicolon\n";
                }
                currentLine = file.readLine();
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return output;
    }
}
