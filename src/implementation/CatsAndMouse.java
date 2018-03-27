/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class CatsAndMouse {
    
    /*
     * Complete the catAndMouse function below.
     */
    static String catAndMouse(int x, int y, int z) {
        /*
         * Write your code here.
         */
        
        int mouseADist = Math.abs(x - z);
        int mouseBDist = Math.abs(y - z);
        
        if (mouseADist == mouseBDist) {
            return "Mouse C";
        }
        
        if (Math.min(mouseADist, mouseBDist) == mouseADist) {       
            return "Cat A";
        }
        
        if (Math.min(mouseADist, mouseBDist) == mouseBDist) {       
            return "Cat B";
        }
        
        return "";
    }

    public static void main(String[] args) throws IOException {
        String result = catAndMouse(1, 2, 3);
        System.out.println(result);
    }
}
