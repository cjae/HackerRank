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
public class DrawingBook {

    static int solve(int n, int p) {
        // Complete this function

        int beg = (p / 2);

        int end = 0;
        if (n % 2 == 1) {
            end = (n - p) / 2;
            System.out.println("odd "+end);
        } else {
            end = (int)Math.ceil((n - p) / 2.0);
            System.out.println("even "+end);
        }

        return Math.min(beg, end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
