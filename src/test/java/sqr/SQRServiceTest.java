package sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Range1',200,300,3",
            "'Range2',0,0,0",
            "'Range3',169,196,2",
            "'Range4',100,1000,22"})
    void shouldCalculateForINRange(String testName, int start, int end, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long actual = service.numberOfSquares(start, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Range5',10,200,2",
            "'Range6',100,1200,10",
            "'Range7',101,121,0",
            "'Range8', 345,674,3"})
    void shouldCalculateNOTForINRange(String testName, int start, int end, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long actual = service.numberOfSquares(start, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertNotEquals(expected, actual);
    }

}


