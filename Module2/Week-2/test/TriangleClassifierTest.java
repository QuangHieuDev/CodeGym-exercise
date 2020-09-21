import BT.NextDayCalculator;
import BT.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    void result() {
        int a = 2;
        int b = 2;
        int c = 2;
        String check = "Tam giác đều";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    void result1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String check = "Tam giác cân";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }

    @Test
    @DisplayName("Testing add 2 + 0")
    void resul2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String check = "Tam giác thường";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }

    @Test
    @DisplayName("Testing add 3 + 0")
    void result3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String check = "Không phải là tam giác";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }

    @Test
    @DisplayName("Testing add 4 + 0")
    void result4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String check = "Không phải là tam giác";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }

    @Test
    @DisplayName("Testing add 5 + 0")
    void result5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String check = "Không phải là tam giác";

        String triangle = TriangleClassifier.result(a, b, c);
        assertEquals(check, triangle);
    }
}