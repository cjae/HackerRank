/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class SockMerchant {
    
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashMap inventory = new HashMap<>();
        int pair = 0;
        
        for (int num : ar) {
            if(inventory.containsKey(num) && inventory.get(num).equals(1)) {
                inventory.put(num, 0);
                pair++;
                continue;
            }
            
            inventory.put(num, 1);
        }
        
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
