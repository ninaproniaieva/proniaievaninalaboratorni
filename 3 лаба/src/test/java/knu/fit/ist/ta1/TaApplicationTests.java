package knu.fit.ist.ta1;

import knu.fit.ist.ta1.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TaApplicationTests {

@Test
void contextLoads() {
    
}

@Test
void test1() {
    
assertEquals(Calculate.lab2equation(1.0f), -0.202f, 0.01f);
assertEquals(Calculate.lab2equation(2.0f), -0.052f, 0.01f);
assertEquals(Calculate.lab2equation(3.0f), -0.028f, 0.01f);
assertEquals(Calculate.lab2equation(4.0f), -0.019f, 0.01f);
assertEquals(Calculate.lab2equation(5.0f), -0.013f, 0.01f);
assertEquals(Calculate.lab2equation(6.0f), -0.010f, 0.01f);
assertEquals(Calculate.lab2equation(7.0f), -0.008f, 0.01f);
assertEquals(Calculate.lab2equation(8.0f), -0.007f, 0.01f);
assertEquals(Calculate.lab2equation(9.0f), -0.006f, 0.01f);
assertEquals(Calculate.lab2equation(10.0f), -0.005f, 0.01f);
assertEquals(Calculate.lab2equation(11.0f), -0.004f, 0.01f);
assertEquals(Calculate.lab2equation(12.0f), -0.003f, 0.01f);
assertEquals(Calculate.lab2equation(13.0f), -0.003f, 0.01f);

}
}
