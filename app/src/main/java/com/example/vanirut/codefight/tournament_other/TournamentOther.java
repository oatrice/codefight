package com.example.vanirut.codefight.tournament_other;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by vanirut on 7/21/2017.
 */

public class TournamentOther {
    public static int exerciseElaboration(int p, int n) {

        StringBuilder sb = new StringBuilder();
        sb.append(p);
        for (int i = 0; i < n; i++)
            sb.append('0');
        sb.append(p);
        BigInteger b = new BigInteger(sb.toString());
        String s = b.multiply(b).toString();
        int result = 0;
        for (char c : s.toCharArray())
            result += c - '0';

        return result;

    }

    public static int exerciseElaboration2(int p, int n) {

        StringBuilder sb = new StringBuilder();
        sb.append(p);
        for (int i = 0; i < n; i++)
            sb.append('0');
        sb.append(p);
        BigInteger b = new BigInteger(sb.toString());
        String s = b.multiply(b).toString();
        int result = 0;
        for (char c : s.toCharArray())
            result += c - '0';

        return result;


        /*
            def exerciseElaboration(p, n):
            x = p * 10 ** (n + 1) + p
            x *= x
            return sum(int(y) for y in str(x))
        */

    }

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

    public static int concatenateNumbers(int a, int b) {
        int tmp = b;
        while (tmp > 0) {
            tmp /= 10;
            a *= 10;
        }

        return a + b;
    }
}
