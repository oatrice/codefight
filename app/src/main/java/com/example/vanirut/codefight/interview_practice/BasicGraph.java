package com.example.vanirut.codefight.interview_practice;

import java.util.ArrayList;

/**
 * Created by vanirut on 7/21/2017.
 */

public class BasicGraph {

    public static boolean hasDeadlock(int[][] connections) {

        ArrayList<Integer> vaultList = new ArrayList<>();
        ArrayList<Integer> connectionsList = new ArrayList<>();

        for (int i = 0; i < connections.length; i++) {
            if (connections[i].length == 0) {
                vaultList.add(i);
            }

        }


        for (int ii = 0; ii < vaultList.size(); ii++) {

            int blacklistNumber = vaultList.get(ii);

            for (int i = 0; i < connections.length; i++) {

                int count = 0;
                for (int j = 0; j < connections[i].length; j++) {

                    if (blacklistNumber == connections[i][j] || connections[i][j] == -1) {
                        connections[i][j] = -1;
                        count++;

                        if (count == connections[i].length && !vaultList.contains(i)) {
                            vaultList.add(i);
                        }

                    }

                }

            }
        }

        for (int i = 0; i < connections.length; i++) {
            for (int j = 0; j < connections[i].length; j++) {
                System.out.println(connections[i][j]);
            }

        }

        int min = connections.length - vaultList.size();
        if (min > 1 || vaultList.size() == 0)
            return true;

        return false;

    }


}
