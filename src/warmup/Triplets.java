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
public class Triplets {
    
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int alice;
        int bob;
        
        alice = ((a0 > b0) ? 1:0) + ((a1 > b1) ? 1:0) + ((a2 > b2) ? 1:0);
        bob = ((a0 < b0) ? 1:0) + ((a1 < b1) ? 1:0) + ((a2 < b2) ? 1:0);
        
        return new int[]{alice, bob};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
