import org.junit.Test;


public class NumberMemorizeTest {

    private NumberMemorizeBridge nmb = new NumberMemorizeBridge();

    @Test
    public void testSum() {
        nmb.add(5);
        nmb.add(10);
        assertEquals(15, nmb.sum(0, 1));
    }

    @Test
    public void testSubtract() {
        nmb.add(10);
        nmb.add(5);
        assertEquals(5, nmb.subtract(0, 1));
    }

    @Test
    public void testMultiply() {
        nmb.add(3);
        nmb.add(4);
        assertEquals(12, nmb.multiply(0, 1));
    }

    @Test
    public void testDivide() {
        nmb.add(8);
        nmb.add(2);
        assertEquals(4, nmb.divide(0, 1));
    }

    @Test
    public void testPow() {
        nmb.add(2);
        nmb.add(3);
        assertEquals(8, nmb.pow(0, 1));
    }

    @Test
    public void testFactorial() {
        nmb.add(5);
        assertEquals(120, nmb.factorial(0));
    }

    @Test
    public void testSumAll() {
        nmb.add(1);
        nmb.add(2);
        nmb.add(3);
        assertEquals(6, nmb.sumAll());
    }

    @Test
    public void testAverage() {
        nmb.add(2);
        nmb.add(4);
        nmb.add(6);
        assertEquals(4.0, nmb.average(), 0.001);
    }
}