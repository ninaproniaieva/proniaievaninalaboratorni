/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import org.springframework.stereotype.Service;

/**
 *
 * @author HP-Notebook
 */
@Service
public class Recursion {
    
    public int minDigit(int number) { 
        if (number == 0) return 0;
        int lastNum = number % 10;
        int otherDigits = number / 10;
        int recursiveLastNum = minDigit(otherDigits);
        return Math.min(lastNum, recursiveLastNum);
    }
}
