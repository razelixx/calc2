import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstTest {

    @Test
    public void testDivideSixByTwo(){
        Divide div = new Divide();
        int testDiv = div.divide(6,2);
        Assert.assertEquals("Результат деления 6/2 должен быть равен 3!",3, testDiv);
    }

    @Test
    public void testDivideByZero() {
       Divide divByZero = new Divide();
        try {
            int dbz = divByZero.divide(5,0);
            fail();
        } catch (ArithmeticException e) {
            assertThat("Деление на 0 выбрасывает ArithmeticException!", e.getMessage(), is("/ by zero"));
        }
    }

    @Test
    public void testMultiplySixByTwo(){
        Multiply mult = new Multiply();
        int testMult = mult.multyply(6,2);
        Assert.assertEquals("Результат умножения 6*2 должен быть равен 12!",12, testMult);
    }

    @Test
    public void testSumSixByTwo(){
        Summa sum = new Summa();
        int testSum = sum.summa(6,2);
        Assert.assertEquals("Результат сложения 6+2 должен быть равен 8!",8, testSum);
    }

    @Test
    public void testMinusSixByTwo(){
        Minus minus = new Minus();
        int testMinus = minus.minus(6,2);
        Assert.assertEquals("Результат вычитания 6-2 должен быть равен 4!",4, testMinus);
    }

}


