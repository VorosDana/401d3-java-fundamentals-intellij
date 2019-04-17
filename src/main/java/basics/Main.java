package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main{
  public static void main(String[] args){
    System.out.println("Pluralize tests");

    int dogCount = 1;
    System.out.println("I have " + dogCount + pluralize(" dog", dogCount) +".");

    int catCount = 3;
    System.out.println("I have " + catCount + pluralize(" cat", catCount) +".");

    int turtleCount = 0;
    System.out.println("I have " + turtleCount + pluralize(" turtle", turtleCount) +".");

    System.out.println("\n\nCoin Flip tests");
  
    System.out.println("\nTest 1: 2 heads in a row");
    flipNHeads(2);

    System.out.println("\nTest 1: 4 heads in a row");
    flipNHeads(4);

    System.out.println("\n\nClock test:");
    displayClock();
  }

  public static String pluralize(String word, int count){
    return (word + ((count > 1 || count == 0) ? "s" : ""));
  }

  public static void flipNHeads(int targetHeads){
    int flips = 0;
    int flippedHeads = 0;
    while(flippedHeads < targetHeads){
      long result = Math.round(Math.random());

      if(result == 1){
        flippedHeads++;
      }
      if(result == 0){
        flippedHeads = 0;
      }
      flips++;
      System.out.println((result == 1) ? "heads" : "tails");
    }
    System.out.println("It took " + flips + " flips to flip " + targetHeads + " heads in a row.");
  }

  public static void displayClock(){
    LocalDateTime time = LocalDateTime.now();

    String currentTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int runCount = 0;

    while(true){
      float kilo = 1_000;
      float mega = 1_000_000;
      float giga = 1_000_000_000;
      time = LocalDateTime.now();
      String testTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if(!testTime.equals(currentTime)){
        String clockSpeed = " ";
        
        if(runCount < kilo){
          clockSpeed += runCount + "Hz";
        }else if(runCount < mega){
          clockSpeed += ((float)runCount / kilo) + "KHz";
        } else if(runCount < giga) {
          clockSpeed += ((float)runCount / mega) + "MHz";
        } else {
          clockSpeed += ((float)runCount / giga) + "GHz";
        }

        System.out.println(currentTime + clockSpeed);
        currentTime = testTime;
        runCount = 0;
      }
      runCount++;
    }

  }


}