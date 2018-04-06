/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class SuperReducedString {

    static String super_reduced_string(String s) {
        // Complete this function
        int numLength = s.length();
        String currentOutput = "";

        for (int i = 0; i < numLength; i++) {
            char character = s.charAt(i);

            if (i + 1 < numLength) {

                if (character == s.charAt(i + 1)) {
                    
                }
            }
        }
        
        return currentOutput;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
