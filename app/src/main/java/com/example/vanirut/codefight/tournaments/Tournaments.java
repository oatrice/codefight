package com.example.vanirut.codefight.tournaments;

import java.math.BigInteger;

/**
 * Created by vanirut on 7/21/2017.
 */

public class Tournaments {
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

    public static int concatenateNumbers(int a, int b) {
        int tmp = b;
        while (tmp > 0) {
            tmp /= 10;
            a *= 10;
        }

        return a + b;
    }
}
