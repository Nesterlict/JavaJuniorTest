package JavaJuniorTest;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.averagingLong;
import static java.util.stream.Collectors.groupingBy;

public class AverageDeposit {
    public enum Type {DEPOSIT, WITHDRAWAL}

    public static class Transaction {
        final Type type;
        final String currency;
        final Long amount;

        public Transaction(@NotNull Type type,
                    @NotNull String currency,
                    @NotNull Long amount) {
            this.type = type;
            this.currency = currency;
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public Long getAmount() {
            return amount;
        }

        public Type getType() {
            return type;
        }
    }

    /**
     * @param transactions список транзакций
     * @return мапа, в которой ключи - валюты (хранятся в алфавитном порядке),
     * - среднее значение всех транзакций типа "депозит" в данной валюте
     * Пример входных данных:
     * [
     * Transaction(DEPOSIT, ""EUR"", 100),
     * Transaction(DEPOSIT, "EUR", 200),
     * Transaction(WITHDRAWAL, "USD", 1250),
     * Transaction(DEPOSIT, "USD", 2000),
     * Transaction(DEPOSIT, "RUB", 15),
     * Transaction(DEPOSIT, "RUB", 35),
     * Transaction(WITHDRAWAL, "RUB", 55)
     * ]
     * <p>
     * Ожидаемый результат:
     * ["EUR" -> 150.0, "RUB" -> 25.0, "USD" -> 2000.0 ]
     */


    public Map<String, Double> getAverageDepositAmountByCurrency(List<Transaction> transactions) {
        return transactions.stream()
                .filter(x -> x.getType() == Type.DEPOSIT)
                .collect(groupingBy(
                        Transaction::getCurrency,
                        TreeMap::new,
                        averagingLong(Transaction::getAmount)
                ));
    }
}


