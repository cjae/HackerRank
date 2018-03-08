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
public class GradingStudent {
    
    static int[] solve(int[] grades){
        // Complete this function
        int length = grades.length;
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            
            int num = grades[i];
            
            if (num < 38) {
                result[i] = num;
            } else {
                int prevInt = (int) num / 5;
                int nextInt = prevInt + 1;

                int num2 = nextInt * 5;

                int diff = num2 - num;

                if(diff < 3) {
                    result[i] = num2;
                } else {
                    result[i] = num;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
