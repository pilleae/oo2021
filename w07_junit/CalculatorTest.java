import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test; // for @Test
import org.junit.Before; // for @Before


public class CalculatorTest { 
  private static Calculator calculator = new Calculator();

  @Before
  public void setUp() throws Exception {
    calculator.clear();
  }

  @Test
  public void testAdd() {
    calculator.add(3);
        calculator.add(4);
        assertEquals(7, calculator.getResult());

  }

  @Test
  public void testSubstract() {
    calculator.add(8);
        calculator.substract(3);
        assertEquals(5, calculator.getResult());

  }

  //@Ignore("")
  //@Test
  //public void testMultiply() {
  //  fail("");
  //}

 // @Test(timeout = 1000)
 //public void squareRoot() {
 //    calculator.squareRoot(4);
 //     assertEquals(2, calculator.getResult());
 // }

  //@Test
 // public void testDivide() {
  //  calculator.add(8);
  //      calculator.divide(2);
  //      assertEquals(4, calculator.getResult());

  }

}