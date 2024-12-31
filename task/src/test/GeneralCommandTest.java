import memorizingtool.BooleanMemorize;
import org.junit.Before;
import org.junit.Test;

public class GeneralCommandTest {

    private BooleanMemorize bm;
    @Before
    void Initialize() {
        bm = new BooleanMemorize();
    }
    @Test
    void testAdd() {
        bm.add(true);
    }

    @Test
    void testRemove() {}

    @Test
    void testReplace() {}

    @Test
    void testReplaceAll() {}

    @Test
    void testIndex() {}

    @Test
    void testSort() {}

    @Test
    void testFrequency() {}

    @Test
    void testPrint() {}

    @Test
    void testPrintAll() {}

    @Test
    void testGetRandom() {}

    @Test
    void testCount() {}

    @Test
    void testSize() {}

    @Test
    void testEquals() {}

    @Test
    void testClear() {}

    @Test
    void testCompare() {}

    @Test
    void testMirror() {}

    @Test
    void testUnique() {}

    @Test
    void testReadFile() {}

    @Test
    void testWriteFile() {}

}
