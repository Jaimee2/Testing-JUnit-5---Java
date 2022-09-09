package prubasJunit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    void test(){


        int expected = 3;
        int actual  = mathUtils.add(1,2);

        assertEquals(expected,actual,"the method should add two number");
    }
    @Test
    void testComputerCircleRadius(){
        assertEquals(314.1592653589793,mathUtils.computerCircleArea(10));
    }

    @Test
    void testDivide(){
        assertThrows(NullPointerException.class,() -> mathUtils.divide(1,0));


    }
}