package homeworks.homework_30.task2_3;

public class BankAccount extends Account implements PaymentSystem{

    private BankAccount(String currency, double balance) {
        super(currency,balance);
    }

    // не будем плодить объекты, которые не соответствуют изначальным условиям
    public static BankAccount initBankAccount(String currency, double balance) {
        // Овердрафт неприемлем. Только позитивный баланс
        if (balance < 0) {
            System.out.println("Невозможно создать аккаунт с отрицательной суммой");
            return null;
        }
        return new BankAccount(currency, balance);
    }

}
