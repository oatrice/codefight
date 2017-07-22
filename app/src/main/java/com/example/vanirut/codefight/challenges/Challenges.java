package com.example.vanirut.codefight.challenges;

import java.util.ArrayList;

/**
 * Created by vanirut on 7/22/2017.
 */

public class Challenges {


    public static int digitSumsDifference(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n / 10;
            if (digit % 2 == 1) {
                result -= digit;
            }
            else {
                result += digit;
            }
            n /= 10;
        }

        return result;
    }

    public static int digitsProduct(int product) {
        ArrayList<Integer> answerDigits = new ArrayList<>();
        int answer = 0;

        if (product == 0) {
            return 10;
        }

        if (product == 1) {
            return 1;
        }

        for (int divisor = 9; divisor > 1; divisor--) {
            while (product % divisor == 0) {
                product /= divisor;
                answerDigits.add(divisor);
            }
        }

        if (product > 1) {
            return -1;
        }


        for (int i = answerDigits.size() - 1; i >= 0; i--) {
            answer =  10 * answer + answerDigits.get(i) ;
        }
        return answer;
    }
}
