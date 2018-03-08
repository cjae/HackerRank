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
public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function

        int aLength = a.length;
        int bLength = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int maxA = a[aLength - 1];
        int minB = b[0];

        int noOfIntergers = 0;

        beginCheck:
        for (int i = maxA; i <= minB; i++) {
            for (int num : a) {
                if (i % num != 0) {
                    continue beginCheck;
                }
            }

            for (int num : b) {
                if (num % i != 0) {
                    continue beginCheck;
                }
            }

            noOfIntergers++;

        }

        return noOfIntergers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
