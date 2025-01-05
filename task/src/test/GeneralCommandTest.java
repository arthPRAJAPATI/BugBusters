import memorizingtool.BooleanMemorizeBridge;
import memorizingtool.NumberMemorizeBridge;
import memorizingtool.WordMemorizeBridge;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneralCommandTest {

    private BooleanMemorizeBridge bmb;
    private NumberMemorizeBridge nmb;
    private WordMemorizeBridge wmb;

    @Before
    public void Initialize() {
        bmb = new BooleanMemorizeBridge();
        nmb = new NumberMemorizeBridge();
        wmb = new WordMemorizeBridge();
    }

    @Test
    public void testAdd() {
        bmb.add(true);
        assertEquals(List.of(true), bmb.getList());

        bmb.add(false);
        assertEquals(List.of(true, false), bmb.getList());

        nmb.add(1);
        nmb.add(2);
        nmb.add(3);
        assertEquals(List.of(1, 2, 3), nmb.getList());

        wmb.add("Hello");
        assertEquals(List.of("Hello"), wmb.getList());

        wmb.add("World!");
        assertEquals(List.of("Hello", "World!"), wmb.getList());
    }

    @Test
    public void testRemove() {
        bmb.add(true);
        bmb.add(false);
        bmb.remove(0);
        assertEquals(List.of(false), bmb.getList());

        nmb.add(1);
        nmb.add(2);
        nmb.remove(1);
        assertEquals(List.of(1), nmb.getList());

        wmb.add("Hello");
        wmb.add("World!");
        wmb.remove(0);
        assertEquals(List.of("World!"), wmb.getList());
    }

    @Test
    public void testReplace() {
        bmb.add(true);
        bmb.add(false);
        bmb.replace(1, true);
        assertEquals(List.of(true, true), bmb.getList());

        nmb.add(1);
        nmb.add(2);
        nmb.replace(0, 3);
        assertEquals(List.of(3, 2), nmb.getList());

        wmb.add("Hello");
        wmb.add("World!");
        wmb.replace(1, "Everyone");
        assertEquals(List.of("Hello", "Everyone"), wmb.getList());
    }

    @Test
    public void testReplaceAll() {
        bmb.add(true);
        bmb.add(false);
        bmb.add(true);
        bmb.replaceAll(true, false);
        assertEquals(List.of(false, false, false), bmb.getList());

        nmb.add(1);
        nmb.add(2);
        nmb.add(1);
        nmb.replaceAll(1, 3);
        assertEquals(List.of(3, 2, 3), nmb.getList());

        wmb.add("Hello");
        wmb.add("World!");
        wmb.add("Hello");
        wmb.replaceAll("Hello", "Hi");
        assertEquals(List.of("Hi", "World!", "Hi"), wmb.getList());
    }

    @Test
    public void testIndex() {
        bmb.add(true);
        bmb.add(false);
        assertEquals(0, bmb.index(true));
        assertEquals(1, bmb.index(false));

        nmb.add(1);
        nmb.add(2);
        assertEquals(1, nmb.index(2));

        wmb.add("Hello");
        wmb.add("World!");
        assertEquals(1, wmb.index("World!"));
    }

    @Test
    public void testSort() {
        nmb.add(3);
        nmb.add(1);
        nmb.add(2);
        nmb.sort("ascending");
        assertEquals(List.of(1, 2, 3), nmb.getList());

        nmb.sort("descending");
        assertEquals(List.of(3, 2, 1), nmb.getList());

        wmb.add("C");
        wmb.add("A");
        wmb.add("B");
        wmb.sort("ascending");
        assertEquals(List.of("A", "B", "C"), wmb.getList());

        wmb.sort("descending");
        assertEquals(List.of("C", "B", "A"), wmb.getList());
    }

    @Test
    public void testFrequency() {
        nmb.add(1);
        nmb.add(2);
        nmb.add(1);
        assertEquals(2, nmb.frequency(1));
        assertEquals(1, nmb.frequency(2));

        wmb.add("A");
        wmb.add("B");
        wmb.add("A");
        assertEquals(2, wmb.frequency("A"));
    }

    @Test
    public void testPrint() {
        bmb.add(true);
        assertEquals("true", bmb.print(0));

        nmb.add(1);
        assertEquals("1", nmb.print(0));

        wmb.add("Hello");
        assertEquals("Hello", wmb.print(0));
    }

    @Test
    public void testPrintAll() {
        wmb.add("A");
        wmb.add("B");
        assertEquals("[A, B]", wmb.printAll("asList"));
        assertEquals("A\nB", wmb.printAll("lineByLine"));
        assertEquals("A B", wmb.printAll("oneLine"));
    }

    @Test
    public void testGetRandom() {
        wmb.add("A");
        wmb.add("B");
        assertTrue(List.of("A", "B").contains(wmb.getRandom()));
    }

    @Test
    public void testCount() {
        wmb.add("A");
        wmb.add("B");
        wmb.add("A");
        assertEquals(2, wmb.count("A"));
    }

    @Test
    public void testSize() {
        wmb.add("A");
        wmb.add("B");
        assertEquals(2, wmb.size());
    }

    @Test
    public void testEquals() {
        wmb.add("A");
        wmb.add("A");
        assertTrue(wmb.equals(0, 1));
    }

    @Test
    public void testClear() {
        wmb.add("A");
        wmb.clear();
        assertTrue(wmb.getList().isEmpty());
    }

    @Test
    public void testCompare() {
        nmb.add(1);
        nmb.add(2);
        assertEquals(-1, nmb.compare(0, 1));
    }

    @Test
    public void testMirror() {
        wmb.add("A");
        wmb.add("B");
        wmb.add("C");
        wmb.mirror();
        assertEquals(List.of("C", "B", "A"), wmb.getList());
    }

    @Test
    public void testUnique() {
        wmb.add("A");
        wmb.add("B");
        wmb.add("A");
        wmb.unique();
        assertEquals(List.of("A", "B"), wmb.getList());
    }

    @Test
    public void testReadFile() {
        String testFile = "testFile.txt";
        wmb.readFile(testFile);
        assertEquals(List.of("A", "B", "C"), wmb.getList());
    }

    @Test
    public void testWriteFile() {
        String testFile = "testFile.txt";
        wmb.add("A");
        wmb.add("B");
        wmb.writeFile(testFile);
        // Assuming readFile reads the same data written
        wmb.readFile(testFile);
        assertEquals(List.of("A", "B"), wmb.getList());
    }
}
