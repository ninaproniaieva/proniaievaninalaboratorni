/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.List;
/**
 *
 * @author HP-Notebook
 */
public class LinearSearch {
     public static int linearSearch(int find, List<Integer> list) {
        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }
}
