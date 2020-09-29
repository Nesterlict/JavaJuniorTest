
import JavaJuniorTest.AverageDeposit;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class AverageDepositTest {


    @Test
    public void averageDepositTest(){
        Map<String,Double> test = new TreeMap<>();
        test.put("EUR",150.0);
        test.put("USD",2000.0);
        test.put("RUB",25.0);

        List<AverageDeposit.Transaction> transactions = new ArrayList<>();
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.DEPOSIT,"EUR",100l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.DEPOSIT,"EUR",200l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.WITHDRAWAL,"USD",1250l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.DEPOSIT,"USD",2000l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.DEPOSIT,"RUB",15l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.DEPOSIT,"RUB",35l));
        transactions.add(new AverageDeposit.Transaction(AverageDeposit.Type.WITHDRAWAL,"RUB",55l));

        AverageDeposit dep = new AverageDeposit();
        assertEquals(dep.getAverageDepositAmountByCurrency(transactions),test);
    }
}