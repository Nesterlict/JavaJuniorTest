package JavaJuniorTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SQL {

    @Autowired
    private JdbcTemplate h2Template;

    String firstQuery = "SELECT DISTINCT table1.* FROM table1 LEFT JOIN table2 ON table1.id = table2.id WHERE table2.id IS NOT NULL";
    String secondQuery = "SELECT table1.* FROM table1 LEFT JOIN table2 ON table1.id = table2.id WHERE table2.id IS NULL";
    String thirdQuery = "SELECT * FROM Table1 UNION ALL SELECT * FROM Table2";

    public List<String> firstQuery() {
        List<Map<String, Object>> result = h2Template.queryForList(firstQuery);
        return createListString(result);
    }

    public List<String> secondQuery() {
        List<Map<String, Object>> result = h2Template.queryForList(secondQuery);
        return createListString(result);
    }

    public List<String> thirdQuery() {
        List<Map<String, Object>> result = h2Template.queryForList(thirdQuery);
        return createListString(result);
    }

    public List<String> createListString(List<Map<String, Object>> result) {
        List<String> listOfValue = new ArrayList<>();
        for (Map map : result) {
            listOfValue.addAll(map.values());
        }
        return listOfValue;
    }


}
