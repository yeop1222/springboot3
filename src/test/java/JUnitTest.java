import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @DisplayName("1+2=3이다")
    @Test
    public void jUnitTest() {
        int a=1;
        int b=2;
        int sum=3;

        Assertions.assertEquals(a+b, sum);
    }

//    @DisplayName("1+3=4이다")
//    @Test
//    public void jUnitFailedTest(){
//        int a=1;
//        int b=3;
//        int sum=3;
//
//        Assertions.assertEquals(a+b,sum);
//    }
}
