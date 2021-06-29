/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author HP-Notebook
 */
public class SearchWord {
    public static List<Integer> linearSearch(String find, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isEmpty() || find.isEmpty()) return result;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();

        for (int i = 0, j=n-1; i<=j ; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
    
     public static List<Integer> linearSearch(String find, int start, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isEmpty() || find.isEmpty()) return result;
        if(start<0) start = 0;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();

        for (int i = start, j=n-1; i<=j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        
        return result;
    }
    
    public static List<Integer> linearSearch(String find, int start, int finish, String text) {
        List<Integer> result = new ArrayList<>();
        if(text.isEmpty() || find.isEmpty()) return result;
        if(start<0) start=0;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();
        if(finish>n) finish = n;

        for (int i = start, j=finish-1; i <= j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
    
    public static List<Integer> linearSearch(String find, String text, int finish) {
        List<Integer> result = new ArrayList<>();
        if(text.isEmpty() || find.isEmpty()) return result;
        List<String> list = Arrays.asList(text.split(" "));
        if(list.isEmpty()) return result;
        int n = list.size();
        if(finish>n) finish = n;

        for (int i = 0, j=finish-1; i <= j; i++) {
            if (list.get(i).equals(find)) {
                result.add(i);
            }
            if (list.get(j).equals(find) && i!=j) {
                result.add(j);
            }
            --j;
        }
        return result;
    }
}
