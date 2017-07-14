package com.example.vanirut.codefight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vanirut on 7/4/2017.
 */

public class CodeFight {
    public static int centuryFromYear(int year) {
        long startTime = System.nanoTime();

        int twoDigitFirst = year / 100;
        if(year % 100 > 0){
            twoDigitFirst++;
        }

        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime));
        return twoDigitFirst;
    }

    public static boolean checkPalindromeByHopping(String inputString){
        int length = inputString.length();
        int middleLength = length / 2;
        boolean result = false;

        for (int position = 0; position < middleLength; ++position) {

            if (inputString.charAt(position) != inputString.charAt(length - position - 1)) {
                System.out.println("inputString: " + inputString + ", result: " + result);
                return result;

            }

        }int[] a = new int[0];
        int b = a.length;

        result = true;
        System.out.println("inputString: " + inputString + ", result: " + result);

        return result;
    }

    public static boolean checkPalindromeByReverse(String inputString){
        //Time exceed version.

        long startTime = System.currentTimeMillis();
        String palindromeString = "";
        for (int i = inputString.length() - 1; i >= 0; i--){
            palindromeString += inputString.charAt(i);

        }

        boolean result = false;
        if (inputString.equals(palindromeString)) {
            result = true;
        }

        System.out.println("\n\ninputString: " + inputString);
        System.out.println("palindromeString: " + palindromeString + ", result: " + result);
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
        return result;
    }

    public static int adjacentElementsProduct(int[] inputArray) {

        int result = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++){
            int firstNumber = inputArray[i];
            int secondNumber = inputArray[i+1];
            int producted = firstNumber * secondNumber;

            if (result < producted) {
                result = producted;
            }
        }

        return result;

    }

    public static long shapeArea(long n) {

        long sumUpper = 0;
        long base = n * 2 - 1;

        for (int i = 1; i < n; i++) {
            sumUpper += i * 2 - 1;
            System.out.println("sumUpper: " + sumUpper);
        }

        long sumNotBase = sumUpper * 2;
        long result = sumNotBase + base;

        System.out.println("sumUpper: " + sumUpper);
        System.out.println("sumNotBase: " + sumNotBase);
        System.out.println("n: " + n + ", base: " + base + ", result: " + result);

        return result;
    }

    public static int makeArrayConsecutive(int[] statues) {
        // TODO Problem: ต้องการหาจำนวนเลขที่ต้องนำมาเติมใส่ใน array เพื่อให้เกิดการเรียงกัน เช่น
        // TODO [6, 2, 3, 8] เลขที่ต้องนำมาเติมคือ 4, 5, 7 มีทั้งหมด 3 ตัว ตอบ 3

        Arrays.sort(statues);
        int length = statues.length;
        int min = statues[0];
        int max = statues[length - 1];
        int result = max - min -length + 1;

        return result;
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        //TODO Problem: ถ้าหากเอาเลขออกจาก array ไป 1 ตัวแล้วทำให้เกิดการเรียงลำดับจากน้อยไปมากได้ให้ตอบ true

        //Solved
        /*  1. หาตำแหน่งของการเกิด badIndex จากตำแหน่งแรกไปตำแหน่งสุดท้าย โดยเก็บค่า index
            ที่ทำให้เกิด badIndex ไปเรื่อยๆ(เก็บทับค่าเดิม) เราจะได้ badIndex ตัวท้ายสุดมา
            (อีกไอเดียนึงคือ ถ้าเก็บตัวแรกได้แล้วก็ให้ออกจาก loop เลยจะเร็วกว่า)

            2. เช็คว่ามี badIndex มั้ย (if badIndex == -1) ถ้าหากไม่มี ให้ return true

            3. ถ้ามี ให้สร้าง list ขึ้นมาใหม่โดยไม่เอาตำแหน่ง badIndex มาด้วย

            4.
        */

        boolean good;
        int badIndex = -1;
        ArrayList<Integer> newSequenceList = new ArrayList<>();

        for (int i = 0; i < sequence.length-1; i++) {
            if (sequence[i] < sequence[i+1]) {
                good = true;
            } else {
                good = false;
                if (i != 0) {
                    if (sequence[i-1] < sequence[i+1]) {
                        badIndex = i;
                    } else badIndex = i+1;
                } else badIndex = i;
            }
        }


        if (badIndex != -1) {
            for (int i = 0; i < sequence.length; i++ ) {
                if (i != badIndex) {
                    newSequenceList.add(sequence[i]);
                }
            }

            good = false;

        } else
            return true;

        //ในกรณีที่ตัด badIndex ออกแล้ว อาจเหลือแค่ 1 index ซึ่งควรตอบ true ไว้ก่อน
        // เพราะถ้าหากไม่ set เป็น true ไว้ มันจะไม่เข้า for loop แล้วจะ return false ทันที
        good = true;

        for (int i = 0; i < newSequenceList.size()-1; i++) {
            if (newSequenceList.get(i) < newSequenceList.get(i+1)) {
                good = true;
            }
            else
                return false;
        }

        return good;
    }

    public static boolean almostIncreasingSequenceExceed(int[] sequence) {
        //Time exceed version.
        //TODO Problem: ถ้าหากเอาเลขออกจาก array ไป 1 ตัวแล้วทำให้เกิดการเรียงลำดับจากน้อยไปมากได้ให้ตอบ true

        long startTime = System.currentTimeMillis();
        long startTime2 = System.nanoTime();

        for (int erasedIndex = 0; erasedIndex < sequence.length; ++erasedIndex) {
            boolean increasing = true;
            int last = 0,
                    start = 1;

            if (erasedIndex == 0) {
                last = 1;
                start = 2;
            }

            for (int j = start; j < sequence.length; ++j) {
                if (j == erasedIndex) {
                    continue;
                }
                if (sequence[j] <= sequence[last]) {
                    increasing = false;
                    break;
                }
                last = j;
            }

            if (increasing) {
                return true;
            }
        }
        long endTime = System.currentTimeMillis();
        long endTime2 = System.nanoTime();
        System.out.println("time2: " + (endTime - startTime));
        System.out.println("time4: " + (endTime2 - startTime2));

        return false;
    }

    public static int matrixElementsSum(int[][] matrix) {

        long startTime = System.currentTimeMillis();

        ArrayList<Integer> zeroRoomRow = new ArrayList<>();
        ArrayList<Integer> zeroRoomColumn = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] == 0) {
                    zeroRoomRow.add(row);
                    zeroRoomColumn.add(column);

                }

            }

        }


        int result = 0;
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                int rowStore = 0;
                int rowIndex = zeroRoomColumn.indexOf(column);
                if (rowIndex != -1)
                    rowStore = zeroRoomRow.get(rowIndex);

                if (!zeroRoomColumn.contains(column) || rowStore > row) {
                    int value = matrix[row][column];
                    result += value;

                }

            }

        }

        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
        System.out.println("result: " + result);

        return result;
    }

    public static String[] allLongestStrings(String[] inputArray) {

        int longestString = 0;
        ArrayList<String> result = new ArrayList<>();

        for (String inner : inputArray) {

            if (inner.length() > longestString) {
                longestString = inner.length();
                result.clear();
                result.add(inner);

            } else if (inner.length() == longestString) {
                result.add(inner);
            }

        }

        return result.toArray(new String[0]);
    }

    public static int commonCharacterCount(String s1, String s2) {

        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);

        int count = 0;
        int countA1 = 0;
        int countA2 = 0;
        char storechar = 0;

        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        Map<Character, Integer> a11 = new HashMap<Character, Integer>();

        for (int i = 0; i < s1Array.length-1; i++) {
            System.out.println("AAA: " + s1Array[i]);

            if (i == 0) {
                count = 1;
                if (s1Array[i] == s1Array[i+1]) {
                    count = 2;
                }

            } else if (s1Array[i] == s1Array[i+1] && s1Array[i-1] == s1Array[i]) {
                count += 1;

            } else if (s1Array[i] == s1Array[i+1] && s1Array[i-1] != s1Array[i]) {
                count = 2;

            }
            a11.put(s1Array[i], count);
        }

        for (Map.Entry<Character, Integer> entry : a11.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            System.out.println("key, " + key + " value " + value);
        }


        return 0;
    }


}
