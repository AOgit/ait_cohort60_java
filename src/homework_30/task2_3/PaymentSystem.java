package homework_30.task2_3;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();

    // при переводе валютные курсы не берем в расчет
    // чтобы не усложнять расчеты при переводе
    void transferMoney(double amount, Account account);

}
