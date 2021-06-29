/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1;

/**
 *
 * @author Владимир
 */
public class MyFirstJavaClass {

    private int myInt;
    private static int myStaticInt;
    
    

    public MyFirstJavaClass(int myInt) {
        this.myInt = myInt;
    }

    public MyFirstJavaClass() {
    }

    public static int getMyStaticInt() {
        return myStaticInt;
    }

    public static void setMyStaticInt(int aMyStaticInt) {
        myStaticInt = aMyStaticInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "MyFirstJavaClass{" + "myInt=" + myInt + '}';
    }

    public static String toStringStatic() {
        return "MyFirstJavaClass{" + "myStaticInt=" + myStaticInt + '}';
    }
}
