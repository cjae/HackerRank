/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class BreakingRecords {

    static int[] breakingRecords(int[] score) {
        // Complete this function

        int min = score[0];
        int max = score[0];

        int minCount = 0;
        int maxCount = 0;

        for (int num : score) {
            if (num < min) {
                min = num;
                minCount++;
            }

            if (num > max) {
                max = num;
                maxCount++;
            }
        }

        return new int[]{maxCount, minCount};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
}
