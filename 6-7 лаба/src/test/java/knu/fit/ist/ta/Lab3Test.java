/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab3.Task1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author HP-Notebook
 */
@SpringBootTest
public class Lab3Test {
    
    int[] test_arr1 = {-10, 3, 9};
    int[] test_arr2 = {11, 4, -8, 16, 11};
    int[] test_arr3 = {13, -3, 9};
    int[] test_arr4 = {18, 4, 8, 19, -11};
    
     @Test
        void test1() {    
        assertEquals(-1, Task1.output(test_arr1));        
        }
        
     @Test 
        void test2() {    
        assertEquals(8, Task1.output(test_arr2));        
        }
        
    @Test 
        void test3() {    
        assertEquals(10, Task1.output(test_arr3));        
        }
        
    @Test 
        void test4() {    
        assertEquals(8, Task1.output(test_arr4));        
        } 
}
