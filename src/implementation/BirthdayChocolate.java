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
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        // Complete this function
        int sum = 0;
        int ways = 0;

        if (m <= n) {
            for (int i = 0; i < m; i++) {
                sum += s[i];
            }
        }

        if (sum == d) {
            ways++;
        }

        for (int i = m; i < n; i++) {
            sum += s[i] - s[i - m];

            if (sum == d) {
                ways++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
