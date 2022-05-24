package pages;

import objects.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    Calculator calc;

    @Before
    public void setup()
    {
        calc = new Calculator();
    }

    @Test
    public void addTwoNumbers()
    {
        Assert.assertEquals(20, calc.add(10,10));
    }

    @Test
    public void addThreeNumbers()
    {
        Assert.assertEquals(30, calc.add(10,10,10));
    }

    @Test
    public void subtractTwoNumbers()
    {
        Assert.assertEquals(0, calc.subtract(10,10));
    }

    @Test
    public void subtracthreeNumbers()
    {
        Assert.assertEquals(0, calc.subtract(10,10,0));
    }


}
