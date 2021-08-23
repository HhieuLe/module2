package NextDayCalculator;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    //public static void main(String[] args) {


    @Test
    public void testNextDay() {
        int day = 5;
        int month = 12;
        int year = 1999;
        String expected = "6/12/1999";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }
        @Test
       public void testNextDay1(){
            int day = 31, month = 12, year = 1996;
            String expectred = "1/1/1997";

            String result = NextDayCalculator.getNextDay(day, month, year);
            assertEquals(expectred, result);
        }

}
