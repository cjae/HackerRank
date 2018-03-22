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
public class CountingValleys {

    static int countingValleys(int n, String s) {
        // Complete this function
        int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowLevel = false;

        for (char step : s.toCharArray()) {
            if (step == 'U') {
                level++;
            } else {
                level--;
            }

            //Handle transitions
            if (!belowLevel && level < 0) {
                valleys++;
                belowLevel = true;
            }

            //We are back above sea level
            if (level >= 0) {
                belowLevel = false;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
