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
public class MigratoryBirds {
    
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] counterArray = new int[5];
        
        for (int i = 0; i < n; i++) {
            counterArray[ar[i] - 1]++;
        }
        
        int position = 0;
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            if (temp < counterArray[i]) {
                position = i + 1;
                temp = counterArray[i];
            }
        }
        
        return position;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
