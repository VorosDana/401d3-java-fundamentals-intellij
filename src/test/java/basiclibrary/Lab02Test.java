package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab02Test {

    @Test
    public void TestRollOutputRange() {
        assertTrue( rollTestHelper( Lab02.roll(20) ) );
    }

    public static boolean rollTestHelper(int[] test){
        for(int num : test){
            if(num < 1 || num > 6){
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestContainsDuplicates(){
        assertTrue(Lab02.containsDuplicates(new int[] {2, 6, 7, 9, 7, 5}));
    }

    @Test
    public void TestDoesNotContainDuplicates(){
        assertFalse(Lab02.containsDuplicates(new int[] {2, 6, 9, 7, 5}));
    }

    @Test
    public void TestArrayAverage(){
        assertEquals(8, Lab02.arrayAverage( new int[] {10, 6, 4, 8, 12}));
    }

    // Make sure it handles an empty array, expect default int value of 0
    @Test
    public void TestArrayAverageEmptyArray(){
        assertEquals(0, Lab02.arrayAverage( new int[] {}));
    }

    @Test
    public void TestArrayOfArrays(){
        assertArrayEquals(new int[] {2, 3, 4}, Lab02.arrayOfArrays(new int[][] {{2, 3, 4}, {10, 20, 30}, {8, 9}}));
    }

    // Make sure it handles an empty array in the input
    @Test
    public void TestArrayOfArraysIncludesEmptyArray(){
        assertArrayEquals(new int[0], Lab02.arrayOfArrays(new int[][] {{2, 3, 4}, {10, 20, 30}, {8, 9}, new int[0]}));
    }

    // Make sure it handles a completely empty input
    @Test
    public void TestArrayOfArraysEmptyInput(){
        assertArrayEquals(new int[0], Lab02.arrayOfArrays(new int[][] {}));
    }

}
