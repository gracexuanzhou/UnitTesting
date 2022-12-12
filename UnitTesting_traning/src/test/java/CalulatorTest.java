import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalulatorTest {
    @Test
    public void testSum(){
        double result = Calculator.sum(2.75,2.25);
        Assertions.assertEquals(result,5);
    }
    @Test
    public void testMul(){
        double result = Calculator.multiple(2,8);
        Assertions.assertEquals(result,16);
    }
    @Test
    public void testDiv(){
        double result = Calculator.divide(4,2);
        Assertions.assertEquals(result,2);
    }
    @Test
    public void testSub(){
        double result = Calculator.subtract(7.5,2.4);
        Assertions.assertEquals(result,5.1);
    }

    @Test
    public void testDivisionbyZero(){
        Assertions.assertThrows(RuntimeException.class,()->Calculator.divide(0,4));
    }

  /*  public static void main(String [] args){
        testSum();
        testMul();
        testDiv();
        testSub();
        testDivisionbyZero();
    }*/

}
