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

        while(s.length() > 1) {
            int numLength = s.length();
            int i = 0;
            
            char character = s.charAt(i);

            if (i + 1 < numLength) {

                if (character == s.charAt(i + 1)) {
                    
                    if (i + 2 < numLength) {
                        s = s.substring(i + 2);
                    }
                }
            }
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
