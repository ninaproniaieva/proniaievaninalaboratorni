package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.EquationSample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

     @Autowired
    EquationSample equationSample;

    @Test
    void test1() {
        assertEquals(5, equationSample.solve(2));
        assertEquals(-5, equationSample.solve(-2));
        assertEquals(Integer.MAX_VALUE, equationSample.solve(0));
    }
}
