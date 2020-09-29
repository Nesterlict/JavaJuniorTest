import JavaJuniorTest.SQL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import  static org.junit.Assert.*;

@ContextConfiguration("/testContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SQLTest {

    @Autowired
    private SQL q;

    @Test
    public void firstQueryTest(){
        List<String> test = new ArrayList<>(List.of(
                "2","Name2",
                "3","Name3"));
        assertEquals(q.firstQuery(),test);
    }

    @Test
    public void secondQueryTest(){
        List<String> test = new ArrayList<>(List.of(
                "1","Name1",
                "4","Name3"));
        assertEquals(q.secondQuery(),test);
    }
    @Test
    public void thirdQueryTest(){
        List<String> test = new ArrayList<>(List.of(
                "1","Name1",
                "2","Name2",
                "3","Name3",
                "4","Name3",
                "2","Name2",
                "2","Name3",
                "3","Name3",
                "3","Name4"));
        assertEquals(q.thirdQuery(),test);
    }
}
