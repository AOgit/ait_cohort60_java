package homeworks.homework_30.task2_3;

public class ElectronicWallet extends Account implements PaymentSystem{


    private ElectronicWallet(String currency, double balance) {
        super(currency,balance);
    }

    // не будем плодить объекты, которые не соответствуют изначальным условиям
    public static ElectronicWallet initWalletAccount(String currency, double balance) {
        // Овердрафт неприемлем. Только позитивный баланс
        if (balance < 0) {
            System.out.println("Невозможно создать аккаунт с отрицательной суммой");
            return null;
        }
        return new ElectronicWallet(currency, balance);
    }
}
