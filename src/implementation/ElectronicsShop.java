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
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s) {
        // Complete this function
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int maxSum = keyboards[0] + drives[0];

        if (s < maxSum) {
            return -1;
        }
        
        for (int priceKeyboard : keyboards) {

            for (int priceDrive : drives) {
                int sumPrice = priceKeyboard + priceDrive;

                if (sumPrice <= s && sumPrice > maxSum) {
                    maxSum = sumPrice;
                }

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }

        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
