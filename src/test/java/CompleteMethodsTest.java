import static org.junit.Assert.*;
import static JavaJuniorTest.CompleteMethods.*;

import org.junit.Test;

public class CompleteMethodsTest {

    @Test
    public void countWordsTest(){
        assertEquals(countWords("    asd  /s/   aasd asd    asd    "),5);
    }

    @Test
    public void removeDuplicatesTest(){
        assertArrayEquals(removeDuplicates(new int[]{1,2,2,3,3,4,5,6}),new int[]{1,2,3,4,5,6});
    }
}
