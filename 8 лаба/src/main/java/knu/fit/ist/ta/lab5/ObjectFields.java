/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;
import java.util.Random;
/**
 *
 * @author HP-Notebook
 */
public class ObjectFields {
    Random rnd = new Random();
    
    private String str = "";

    public ObjectFields() {
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    
    private short shr = Short.MAX_VALUE;

    public void setShr(short shr) {
        this.shr = shr;
    }
    
    public short getShr() {
        return shr;
    }

    private int index;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
