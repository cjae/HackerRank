/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author osagieomon
 */
public class PickingNumbers {

    static int pickingNumbers(int[] A) {
        // Complete this function
        int n = A.length;
        int maxSet = 0;

        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (frequencies.containsKey(A[i])) {
                frequencies.put(A[i], frequencies.get(A[i]) + 1);
            } else {
                frequencies.put(A[i], 1);
            }
        }

        for (int i : frequencies.keySet()) {
            int left = (frequencies.containsKey(i - 1)) ? 
                    frequencies.get(i) + frequencies.get(i - 1) : frequencies.get(i);
            int right = (frequencies.containsKey(i + 1)) ? 
                    frequencies.get(i) + frequencies.get(i + 1) : frequencies.get(i);

            if (left > maxSet) {
                maxSet = left;
            }
            if (right > maxSet) {
                maxSet = right;
            }
        }

        return maxSet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
