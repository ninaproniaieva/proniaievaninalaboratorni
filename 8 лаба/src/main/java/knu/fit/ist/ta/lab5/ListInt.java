/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author HP-Notebook
 */
public class ListInt {
     public static List<Integer> listOfInt(int max){
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        if(max<=0) return list;
        int k = rnd.nextInt(max);
        for(int i=0;i<=k;++i){
            list.add(rnd.nextInt(max));
        }
        return list;
    }   
}
