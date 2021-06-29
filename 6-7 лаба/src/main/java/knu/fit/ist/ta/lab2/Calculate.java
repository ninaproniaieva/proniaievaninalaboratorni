/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author HP-Notebook
 */
public class Calculate {
    
    public static float lab2equation(float x){
        
        float a = 4; float b = -6; float c = -9; float d =1;
        if(a*x*x + b*x + c == 0){return Integer.MAX_VALUE;}
        return (float) Math.sqrt(d*x)/(a * x * x + b * x + c);
    }
    
}
