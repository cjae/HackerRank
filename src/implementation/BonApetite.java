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
public class BonApetite {
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] arr = new int[n];
        
        int sumActual = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            
            if(i == k) {
                continue;
            } 
            
            sumActual += arr[i];
        }
        
        int bActual = sumActual / 2;
        int bCharged = in.nextInt();
        
        if(bCharged - bActual == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bCharged - bActual);
        }
        
    }
}
