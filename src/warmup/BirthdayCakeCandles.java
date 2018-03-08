package warmup;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osagieomon
 */
public class BirthdayCakeCandles {
    
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        
        int count = 0;
        int max = 0;
        for (int i = n-1; i >= 0; i--) {
            if (ar[i] >= max) {
                max = ar[i];
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
