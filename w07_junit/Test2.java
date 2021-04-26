  
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test; // for @Test
import org.junit.Before; // for @Before

public class Test2 { 
    private static Calculator calculator ＝ new Calculator();
    @Before
    public void clearCalculator(){
        calculator.clear();
    }

    @Test
    public void square1() {
        calculator.square(2);
        assertEquals(4, calculator.getResult());
    }     

    @Test    
    public void square2(){
        calculator.square(0);
        assertEquals(0, calculator.getResult());
    }

    @Test    
    public void square3(){
        calculator.square(-3);
        assertEquals(9, calculator.getResult());
    }
}