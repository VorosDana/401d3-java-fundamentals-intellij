package basiclibrary;

import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(roll(5)));
    }

    public static int[] roll(int numDice){
        int[] output = new int[numDice];

        for(int i = 0; i < numDice; i++){
            output[i] = (int)Math.floor( (Math.random() * 6) + 1);
        }

        return output;
    }

    public static boolean containsDuplicates(int[] input){
        if(input.length == 0){
            return false;
        }

        // Makes a copy of the array, then sorts it
        // If two values are identical, they will be consecutive
        int[] sortedInput = Arrays.copyOf(input, input.length);
        Arrays.sort(sortedInput);

        // Checks consecutive values for equivalence
        for(int i = 0; i < sortedInput.length - 1; i++){
            if(sortedInput[i] == sortedInput[i+1]){
                // Found a duplicate, return true
                return true;
            }
        }

        // No duplicates, return false
        return false;
    }

    public static int arrayAverage(int[] input){
        if(input.length == 0){
            return 0;
        }

        int total = 0;

        for(int num : input){
            total += num;
        }

        return total / input.length;
    }

    public static int[] arrayOfArrays(int[][] input){
        // Bad input escape
        if(input.length == 0){
            return new int[0];
        }

        // Store averages of each array,
        int[] inputAverages = new int[input.length];

        for(int i = 0; i < input.length; i++){
            inputAverages[i] = arrayAverage(input[i]);
        }

        // Start with first array in the input
        int[] minArray = input[0];
        int minArrayAverage = inputAverages[0];

        // If any have smaller averages, swap that into the min variables
        for(int i = 1; i < input.length; i++){
            if(inputAverages[i] < minArrayAverage){
                minArray = input[i];
                minArrayAverage = inputAverages[i];
            }
        }

        return minArray;
    }

}
