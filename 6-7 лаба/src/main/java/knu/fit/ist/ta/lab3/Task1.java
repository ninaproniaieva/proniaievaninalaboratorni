/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import static java.lang.Math.abs;

/**
 *
 * @author HP-Notebook
 */
public class Task1 {

    public int[] task(int arrayLeng) {
        int[] array = new int[arrayLeng];
        for (int i = 0; i < arrayLeng; i++) {
            array[i] = (int) Math.round((Math.random() * 31) - 15);
        }
        return array;
    }

    public static int output(int[] array) {
        int ar_min = array[0];
        int ar_max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < ar_min) ar_min = array[i];   
            if (array[i] > ar_max) ar_max = array[i]; 
        }
     
        return ar_max + ar_min;
    }

    public String output2(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "}";
        return result;
    }
}
