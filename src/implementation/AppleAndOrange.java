/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples,
            int[] oranges) {
        // Complete this function
        int larry = 0;
        int rob = 0;

        for (int aNum : apples) {
            int dist = a + aNum;

            if (dist >= s && dist <= t) {
                larry++;
            }
        }

        for (int bNum : oranges) {
            int dist = b + bNum;

            if (dist >= s && dist <= t) {
                rob++;
            }
        }

        System.out.println(String.valueOf(larry));
        System.out.println(String.valueOf(rob));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
