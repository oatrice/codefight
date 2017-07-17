package com.example.vanirut.codefight;

import java.util.ArrayList;
import java.util.Arrays;

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
        //TODO: ต้องการหาผลรวมของตัวอักษรที่น้อยที่สุดของแต่ละ string ที่ส่งเข้ามา เช่น
        //TODO: s1 = "aabcc" and s2 = "adcaa"
        //TODO: s1[(a, 2), (b, 1), (c, 2)] และ s2[(a, 3), (c, 1), (d, 1)]
        //TODO: ดังนั้นจะเลือกตัวที่น้อยที่สุด คือ s1[(a, 2)] s2[(c, 1)]
        //TODO: 2+1=3

        //TODO: เปลี่ยน string ให้เป็น char array
        //TODO: เพื่อให้สามารถเช็คตัวอักษรทีละตัวและเรียงลำดับจากน้อยไปมากได้สะดวกมากขึ้น
        //TODO: เรียงลำดับจากน้อยไปมากทั้ง 2 array
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);

        //TODO: สลับให้ s1Array เป็น array ที่สั้นกว่า array เสมอ เพราะต้องการให้ array
        //TODO: ที่สั้นที่สุดเป็นหลักในการวน loop
        char[] storeArray;
        if (s1Array.length > s2Array.length) {
            storeArray = s1Array;
            s1Array = s2Array;
            s2Array = storeArray;

        }

        int result = 0; //ตัวแปรที่เก็บผลลัพธ์จะเพิ่มขึ้นที่ละ 1 ทุกครั้งที่เจอตัวอักษรที่เหมือนกัน
        int s1Index = 0; //ตัวแปรที่ใช้เป็น index สำหรับ array s1Array
        int s2Index = 0; //ตัวแปรที่ใช้เป็น index สำหรับ array 2Array

        //TODO: สาเหตุที่ใช้ index แยกกัน เพราะวิธีการทำงานค่อนข้างต้องการความยืดหยุ่นในการวน
        //TODO:  loop ที่บางครั้งอาจจะไม่ได้เช็คที่ index เท่ากันทุกครั้ง จะมี s2Index
        //TODO:  ที่ต้องวนค่าไปเรื่อยจนกว่าจะถึงตัวสุดท้าย ในขณะที่ s2Index
        //TODO:  อาจจะหยุดรอถ้าเจอตัวอักษรที่ไม่ตรงกัน

        while (s1Index < s1Array.length && s2Index < s2Array.length) {
            //จะออกจาก loop ก็ต่อเมื่อ index ทั้งสองตัวเพิ่มไปถึงตำแหน่งสุดท้ายแล้วเท่านั้น

            if (s1Array[s1Index] == s2Array[s2Index]) {
                result += 1; //1. ถ้าตัวอักษรเท่ากันให้บวกค่าผลลัพธ์ทีละ 1
                s1Index++;  //2.และเพิ่มค่า s1Index ทีละ 1
                s2Index++;  //3. และเพิ่มค่า s/Index ทีละ 1

            } else if (s2Index == s2Array.length-1 && s1Index != s1Array.length-1){
                s2Index = s1Index;  //5. ถ้า s2Index ถึงจุดสุดท้ายแต่ s1Index ยังไม่สุดท้าย-
                s1Index++;          //ให้ s2Index กลับมาที่ตำแหน่ง s1Index และให้ s1Index-
                //เลื่อนไป 1 ตำแหน่ง

            } else {
                s2Index++; //4. ถ้าไม่ตรงเลยให้เพิ่ม s2Index ไปเรื่อยๆ

            }

        }

        return result;
    }

    public static boolean isLucky(int n) {

        Integer input = n;
        String inputStr ="" + input;

        char[] inputChar = inputStr.toCharArray();

        int forwardIndex = 0;
        int backwardIndex = inputChar.length - 1;
        int forwardSum = 0;
        int backwardSum = 0;

        for (;forwardIndex <= inputChar.length/2-1; forwardIndex++, backwardIndex--) {

            forwardSum += inputChar[forwardIndex];
            backwardSum += inputChar[backwardIndex];

        }

        if (forwardSum == backwardSum)
            return true;

        return false;
    }

}
