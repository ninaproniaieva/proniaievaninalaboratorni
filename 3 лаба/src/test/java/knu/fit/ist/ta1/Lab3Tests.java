/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1;

import org.junit.jupiter.api.Test;
import knu.fit.ist.ta.lab3.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Владимир
 */
public class Lab3Tests {
    int a = 10;
    int b = 11;
    int c = 13;
    int d = 1;

    @Test
    void test1() {
        assertEquals(false, Task.isPrimeNumber(a));
    }

    @Test
    void test2() {
        assertEquals(false, Task.isPrimeNumber(b));
    }

    @Test
    void test3() {
        assertEquals(false, Task.isPrimeNumber(c));
    }

    @Test
    void test4() {
        assertEquals(true, Task.isPrimeNumber(d));
    }
}
