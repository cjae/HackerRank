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
public class DiagonalDifference {
    
    static int diagonalDifference(int[][] a) {
        // Complete this function
        int col = 0;
        int row = a.length - 1;
        
        int total1 = 0;
        int total2 = 0;
        
        for (int i = 0; i < a.length; i++) {
            total1 +=  a[i][i];
            total2 +=  a[col][row];
            
            col++;
            row--;
        }
        
        return Math.abs(total1 - total2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
