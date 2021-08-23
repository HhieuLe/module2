package AbsoluteNumber;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {
    @Test
    void testFinAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAboluteNegative1(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected,result);
    }
}