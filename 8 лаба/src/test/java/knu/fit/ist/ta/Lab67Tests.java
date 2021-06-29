/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import org.springframework.boot.test.context.SpringBootTest;
import knu.fit.ist.ta.lab67.Recursion;
import knu.fit.ist.ta.lab67.Tree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author HP-Notebook
 */
@SpringBootTest
public class Lab67Tests {
    Recursion rec = new Recursion();
    Tree tree1 = new Tree();   
    Tree tree2 = new Tree();
    Tree tree3 = new Tree();
    
 @Test
        void test1() {  
            tree1.add(1);
            tree1.add(10);
            tree1.add(8);
            tree1.add(4);
            tree1.add(11);
            tree1.add(2);
            tree1.add(9);
            tree1.add(6);
    
       // assertEquals(rec.reverseDigits(57896), "69875");
        assertEquals(String.valueOf(tree1.containsNode(6)), "true");        
        assertEquals(String.valueOf(tree1.getNodeIndex(10)), "1");
        assertEquals((tree1.getTree()).toString(), "[1, 10, 8, 4, 11, 2, 9, 6]");
        assertEquals((tree1.getTraversePreOrder(tree1.root)).toString(), " 1 10 8 4 2 6 9 11");
        }
}
