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
public class TheHurdleRace {
    
    static int hurdleRace(int k, int[] height) {
        // Complete this function
        Arrays.sort(height);
        
        int dose = height[height.length - 1] - k;
        
        if (dose < 0) {
            return 0;
        } else {
            return dose;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
