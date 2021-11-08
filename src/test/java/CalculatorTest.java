import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){ calculator = new Calculator(); }

    @Test
    public void canAdd(){assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void canMultiply(){assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void canDivide(){assertEquals(2, calculator.divide(20.00, 10.00), 0.0); }

}
