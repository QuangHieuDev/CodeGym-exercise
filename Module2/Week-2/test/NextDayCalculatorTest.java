import BT.NextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    void nextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String check = "2-1-2018";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    void nextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String check = "1-2-2018";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

    @Test
    @DisplayName("Testing add 2 + 0")
    void nextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String check = "1-5-2018";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

    @Test
    @DisplayName("Testing add 3 + 0")
    void nextDa3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String check = "1-3-2018";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

    @Test
    @DisplayName("Testing add 4 + 0")
    void nextDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String check = "1-3-2020";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

    @Test
    @DisplayName("Testing add 5 + 0")
    void nextDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String check = "1-1-2019";

        String nextDay = NextDayCalculator.result(day, month, year);
        assertEquals(check, nextDay);
    }

}