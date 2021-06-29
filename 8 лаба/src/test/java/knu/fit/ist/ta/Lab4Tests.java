/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.StringProcessing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author HP-Notebook
 */
@SpringBootTest
public class Lab4Tests {
     StringProcessing sp = new StringProcessing();
    
    String text1 = "The term “Internet of Things” was coined by entrepreneur Kevin Ashton, one of the founders of the Auto-ID Center at MIT"
            + "Ashton was part of a team that discovered how to link objects to the internet through an RFID tag "
            + "He first used the phrase “Internet of Things” in a 1999 presentation – and it has stuck around ever since.";
     
    String text2 = "He first used the phrase “Internet of Things” in a 1999 presentation – and it has stuck around ever since.";
    
    @Test
        void test1() {  
          assertEquals(sp.get4FirstWords(text1), "of the Internet Things ");       
          assertEquals(sp.getAmountWithoutK(text1), 57);
          assertEquals(sp.getAmountWords3Letters(text1), "6");
          assertEquals(sp.getFiveMostPopularWords3Letters(text1), "[nte=4, ter=4, ent=3, ern=3, rne=3]");
        }
        
     @Test 
        void test2() {    
          assertEquals(sp.get4FirstWords(text2), "He    ");       
          assertEquals(sp.getAmountWithoutK(text2), 18);
          assertEquals(sp.getAmountWords3Letters(text2), "1");
          assertEquals(sp.getFiveMostPopularWords3Letters(text2), "[phr=1, ese=1, stu=1, irs=1, ent=1]");
        }
}
