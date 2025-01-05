import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class BooleanMemorizeTest {

    private BooleanMemorizeBridge bmb = new BooleanMemorizeBridge();

    // Boolean Specific
    @Test
    public void testFlip() {
        bmb.add(true);
        bmb.add(false);
        bmb.flip(0);
        assertEquals(List.of(false, false), bmb.getList());
        bmb.flip(1);
        assertEquals(List.of(false, true), bmb.getList());
    }

    @Test
    public void testNegateAll() {
        bmb.add(true);
        bmb.add(false);
        bmb.negateAll();
        assertEquals(List.of(false, true), bmb.getList());
    }

    @Test
    public void testAnd() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(true);
        assertEquals(false, bmb.and(0, 1));
        assertEquals(true, bmb.and(0, 2));
    }

    @Test
    public void testOr() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(false);
        assertEquals(true, bmb.or(0, 1));
        assertEquals(false, bmb.or(1, 2));
    }

    @Test
    public void testLogShift() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(true);
        bmb.logShift(1);
        assertEquals(List.of(false, true, false), bmb.getList());

        bmb.logShift(-1);
        assertEquals(List.of(true, false, true), bmb.getList());
    }

    @Test
    public void testConvertTo() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(true);
        assertEquals("101", bmb.convertTo("string"));
        assertEquals(5, bmb.convertTo("number"));
    }

    @Test
    public void testMorse() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(false);
        bmb.add(true);
        assertEquals(".-", bmb.morse());
    }
}
