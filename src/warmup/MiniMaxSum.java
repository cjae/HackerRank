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
public class MiniMaxSum {
    
    static void miniMaxSum(int[] arr) {
        // Complete this function
        
        //MINE
//        int length = arr.length;
//        int arr2D[][] = new int[][]{ arr, arr, arr, arr, arr};
//    
//        long rowTotal = 0;
//        long arrTotal[] =  new long[length];
//        
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                
//                rowTotal += arr2D[i][j];
//            }
//            
//            arrTotal[i] = rowTotal;
//            rowTotal = 0;
//        }
//        
//        Arrays.sort(arrTotal);
//        
//        System.out.println(arrTotal[0] + " " + arrTotal[length - 1]);

        long sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
