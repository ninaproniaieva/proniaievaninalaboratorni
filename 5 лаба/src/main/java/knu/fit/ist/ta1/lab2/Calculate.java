/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1.lab2;

/**
 *
 * @author Владимир
 */
public class Calculate {

    public static float lab2equation(float x) {
        float a = -8;
        float b = -7;
        float c = 8;
        float d = 2;

        if (a * x * x + b * x + c == 0) {
            return Integer.MAX_VALUE;
        }
        return (float) Math.sqrt(d * x) / (a * x * x + b * x + c);
    }
}
