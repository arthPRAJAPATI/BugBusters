import org.junit.Test;

public class WordMemorizeTest {

    private WordMemorizeBridge wmb = new WordMemorizeBridge();

    @Test
    public void testConcat() {
        wmb.add("Hello");
        wmb.add("World");
        assertEquals("HelloWorld", wmb.concat(0, 1));
    }

    @Test
    public void testSwapCase() {
        wmb.add("Hello");
        assertEquals("hELLO", wmb.swapCase(0));
    }

    @Test
    public void testUpper() {
        wmb.add("hello");
        assertEquals("HELLO", wmb.upper(0));
    }

    @Test
    public void testLower() {
        wmb.add("HELLO");
        assertEquals("hello", wmb.lower(0));
    }

    @Test
    public void testReverse() {
        wmb.add("hello");
        assertEquals("olleh", wmb.reverse(0));
    }

    @Test
    public void testLength() {
        wmb.add("hello");
        assertEquals(5, wmb.length(0));
    }

    @Test
    public void testJoin() {
        wmb.add("Hello");
        wmb.add("World");
        wmb.add("!");
        assertEquals("Hello-World-!", wmb.join("-"));
    }

    @Test
    public void testRegex() {
        wmb.add("apple");
        wmb.add("banana");
        wmb.add("cherry");
        List<String> matches = wmb.regex("a.*a");
        assertEquals(List.of("banana"), matches);
    }
}