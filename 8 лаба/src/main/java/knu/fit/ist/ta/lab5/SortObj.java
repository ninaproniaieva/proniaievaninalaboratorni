/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
/**
 *
 * @author HP-Notebook
 */
public class SortObj {
    private static ArrayList<ObjectFields> list = new ArrayList<>();

    public static void setList(ArrayList<ObjectFields> list) {
        SortObj.list = list;
    }
    
    public static ArrayList<String> listObj() {
        
        ArrayList<String> obj = new ArrayList<>();
        
        if(list.isEmpty()) return obj;
        
        for(int i=0;i<list.size();++i){//17180
            
            obj.add(list.get(i).getStr()+" - "+list.get(i).getShr());
            
        }
        
        return obj;
        
    }
    
    public static ArrayList<String> sortApproach1() {

        ArrayList<String> strListObj = new ArrayList<>();
        
        if(list.isEmpty()) return strListObj;
        
        int s, t; 
        
        ObjectFields m;

        int n = list.size() - 1;
        int k = -1; 

        while (k != n) {
            s = k + 1;
            t = s;

            while (t != n) {
                t++;
                if (list.get(t).getStr().compareTo(list.get(s).getStr())<0) {
                    s = t;
                }
            }

            m = list.get(k + 1);
            list.set(k + 1, list.get(s));
            list.set(s, m);

            k++;
            strListObj.add(list.get(k).getStr());
        }
        
        return strListObj;
    }
    
    public static ArrayList<Short> sortApproach2() {
        
        ArrayList<Short> strListObj = new ArrayList<>();

        if(list.isEmpty()) return strListObj;
        
        int t; 
        Short m;
        int n = list.size() - 1;
        int k = 0;

        for(int f=0;f<n+1;++f) {
            strListObj.add(list.get(f).getShr());  
        }
        
        while (k != n) {
            t = k + 1;

            while (t > 0 && strListObj.get(t) < strListObj.get(t - 1)) {
                m = strListObj.get(t);
                strListObj.set(t, strListObj.get(t - 1));
                strListObj.set(t - 1, m);
                t--;
            }

            k++;

        }
        k=0; 

        return strListObj;
    }

    
    public static ArrayList<String> sortApproach1All(ArrayList<String> listStr, ArrayList<Short> listShr) {

        ArrayList<String> strListObj = new ArrayList<>();
        if(list.isEmpty()) return strListObj;
        
        int n = list.size() - 1;
        if(listStr.size()<(n+1) || listShr.size()<(n+1)) return strListObj;
        int s, t; 
        ObjectFields m;
        int k = -1; 
        
        for(int i=0;i<(n+1);++i){
            list.get(i).setIndex(listStr.indexOf(list.get(i).getStr())+listShr.indexOf(list.get(i).getShr()));
        }

        while (k != n) {
            s = k + 1;
            t = s;

            while (t != n) {
                t++;
                if (list.get(t).getIndex()<list.get(s).getIndex()) {
                    s = t;
                }
            }

            m = list.get(k + 1);
            list.set(k + 1, list.get(s));
            list.set(s, m);

            k++;
            strListObj.add(list.get(k).getStr()+" - "+list.get(k).getShr()+" - "+list.get(k).getIndex());
        }
        
        return strListObj;
    }
}
