package warmup;


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
public class SumOfArray {
    
    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int total = 0;
        for (int i : ar) {
            total += i;
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
