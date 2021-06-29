package junitexample;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assumptions.*;

public class JunitTest {

    @Test
    @Disabled
    void Test1() {
        int num = 10;
        Assertions.assertAll(
                () -> Assertions.assertEquals(10,num),
                () -> Assertions.assertTrue(num==1)
        );
    }

    @Test
    @Disabled
    void Test2() {
        Exception exception = Assertions.assertThrows(
                NumberFormatException.class, () -> {
                    Integer.parseInt("1");
                }
        );
    }

    @Test
    void assumptionTest() {
        assumeTrue(1<2);
        assumeFalse(1>2);
        Assertions.assertEquals(4,2+2);
    }

    @Test
    void assumptionThat() {
        String str = "DASEUL";
        assumingThat(
                str.equals("DASEUL"),
                () -> {
                    Assertions.assertEquals(4, 2+2);
                }
        );
    }
}
