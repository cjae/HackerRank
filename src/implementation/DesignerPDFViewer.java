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
public class DesignerPDFViewer {
    
    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        int noWords = word.length();
        int maxHeight = 0;
        
        for(int i = 0; i < noWords; i++) {
            char c = word.charAt(i);
            int position = letterToAlphabetPos(c);
            
            int height = h[position - 1];
            
            if(height > maxHeight) {
                maxHeight = height;
            }
        }
        
        int area = (noWords * 1) * maxHeight;
        return area;
    }
    
    private static int letterToAlphabetPos(char letter) {
        return Character.toUpperCase(letter) - 64;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
