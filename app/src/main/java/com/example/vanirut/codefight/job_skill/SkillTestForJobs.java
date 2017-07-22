package com.example.vanirut.codefight.job_skill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanirut on 7/22/2017.
 */

public class SkillTestForJobs {


    public static int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {

        List<Integer> rowsToDeleteList = new ArrayList<>();
        List<Integer> columnToDeleteList = new ArrayList<>();

        for (int i = 0; i < rowsToDelete.length; i++) {
            rowsToDeleteList.add(rowsToDelete[i]);
        }

        for (int i = 0; i < columnsToDelete.length; i++) {
            columnToDeleteList.add(columnsToDelete[i]);

        }

        int[][] result = new int
                [matrix.length-rowsToDelete.length]
                [matrix[0].length-columnsToDelete.length];

        int newRow = 0;

        for (int i = 0; i < matrix.length; i++) {

            int newColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.println("!rowsToDeleteList: " + rowsToDeleteList.contains(i));
                System.out.println("!columnToDeleteList: " + columnToDeleteList.contains(j));
                if (!columnToDeleteList.contains(j) && !rowsToDeleteList.contains(i)) {
                    System.out.println("i: " + i);
                    System.out.println("j: " + j);
                    System.out.println("newRow: " + newRow);
                    System.out.println("newColumn: " + newColumn);
                    result[newRow][newColumn] = matrix[i][j];
                    newColumn++;

                }
            }

            if (!rowsToDeleteList.contains(i))
                newRow++;

        }

        return result;
    }

    public static int periodicSequence(int s0, int a, int b, int m) {

        ArrayList<Integer> series = new ArrayList<>();

        do {

            series.add(s0);
            s0 = (a * s0 + b) % m;

        }while (!series.contains(s0));

        series.add(s0);

        int firstIndex = series.indexOf(s0);
        int lastIndex = series.lastIndexOf(s0);

        int result = lastIndex-firstIndex;

        return result;

    }

    public static String[] textJustificationMe(String[] words, int l) {

        ArrayList<ArrayList<String>> AL1 = new ArrayList<>();
        ArrayList<Integer> numAL1 = new ArrayList<>();
        ArrayList<String> AL2 = new ArrayList<>();
        int num = 0;

        for (int i = 0; i < words.length; i++) {

            num += words[i].length() +1;

            if (num <= l) {
                AL2.add(words[i] + " ");

            } else {
                numAL1.add(num-(words[i].length() +1));
                AL1.add(AL2);
                AL2 = new ArrayList<>();
                AL2.add(words[i] + " ");
                num = words[i].length() +1;
            }

        }

        AL1.add(AL2);
        numAL1.add(num);

        for (int i = 0; i < AL1.size(); i++) {

            if (i != AL1.size()-1){
                ArrayList<String> AAL2 = new ArrayList<>();
                AAL2 = AL1.get(i);
                num = numAL1.get(i)-1;
                int diff = l - num;
                int eachSpace = diff/(AAL2.size()-1);
                int eachSpaceMore = diff%(AAL2.size()-1);
                for (int j = 0; j < AAL2.size(); j++) {

                    String space = "";
                    for (int k = 0; k < eachSpace; k++) {
                        space += " ";
                    }

                    String aaa = AAL2.get(j) + space;
                    if (j == AAL2.size()-1) {
                        String bbb = aaa.replace(" ", "");
                        AAL2.set(j, bbb);

                    } else {
                        AAL2.set(j, aaa);

                    }
                }

                if (eachSpaceMore > 0) {
                    /*for (int j = 0; j < AAL2.size(); j++) {

                        AAL2.set(j, aaa);
                    }*/
                    while (eachSpaceMore > 0) {
                        String ccc = AAL2.get(eachSpaceMore % AAL2.size());

                        eachSpaceMore--;
                    }
                }
                AL1.set(i, AAL2);

            } else {
                //add space at last word.
            }
        }

        return null;
    }

    //Original: https://github.com/agusmakmun/CodeFights-1/blob/master/tasks/textJustification.js
    public static String[] textJustificationImproved(String[] words, int L) {
        ArrayList<String> text2 = new ArrayList<>();
        int currentWord = 0;
        while (currentWord < words.length) {
            int left = currentWord;
            int right = left,
                    currentSum = words[left].length();
            while (right + 1 < words.length && currentSum + words[right + 1].length() + 1 <= L) {
                currentSum += words[right + 1].length() + 1;
                right++;

            }
            if (left == right) {//last line
                String line = words[left];
                for (int i = 0; i < L - words[left].length(); i++) {
                    line += ' ';

                }
                text2.add(line);

            } else if (left != right && right + 1 == words.length) {
                int betweenSpace = right - left;
                int freeSpace = L - currentSum;
                int extraSpaces = betweenSpace + freeSpace;
//                int freeSpace = L - currentSum;
//                int extraSpaces = 1 + (int) Math.floor(freeSpace / (right - left));

                String line = "";
//                String minimalSpace = "";
                int index = 0;
                for (int i = 0; i < extraSpaces; i++) {
                    index = left+i;
                    if (index >= words.length) {
                        line += "";

                    } else {
                        line += words[index];

                    }
//                    line += words[i] + minimalSpace;
                    if (extraSpaces > 0) {
                        line += ' ';
//                        extraSpaces--;

                    }
                }

                if (extraSpaces < (right-left+1)) {
                    line += words[index + 1];
                }
                text2.add(line);

            } else {
                int freeSpace = L - currentSum;
                int minimalSpaceLen = 1 + (int) Math.floor(freeSpace / (right - left));
                int extraSpaces = freeSpace % (right - left);
                String minimalSpace = "";
                for (int i = 0; i < minimalSpaceLen; i++) {
                    minimalSpace += ' ';

                }
                String line = "";
                for (int i = left; i < right; i++) {
                    line += words[i] + minimalSpace;
                    if (extraSpaces > 0) {
                        line += ' ';
                        extraSpaces--;

                    }
                }
                text2.add(line + words[right]);

            }
            currentWord = right + 1;

        }
        return text2.toArray(new String[0]);
    }
}
