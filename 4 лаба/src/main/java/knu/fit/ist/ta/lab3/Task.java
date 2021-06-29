/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;

public class Task {

    static Random rand = new Random();

    public static int[] massRand(int k) {
        int n = 30;
        int[] intArray = new int[n];

        for (int j = 0; j < n; j++) {
            intArray[j] = 1 + rand.nextInt(k);
        }
        return intArray;
    }

    public static String output(int[] intArray) {
        String result = "{";
        int n = intArray.length;
        for (int i = 0; i < n; i++) {
            result += intArray[i];
            if (i < n - 1) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }

    public static int[] Arraycheck(int[] intArray) {
        int[] result = new int[intArray.length];
        int n = result.length;
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(intArray[i])) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
