package homework_30.task2_3;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        BankAccount bankAcc = BankAccount.initBankAccount("eur", -100);
        BankAccount bankAcc1 = BankAccount.initBankAccount("usd", 100);
        BankAccount bankAcc2 = BankAccount.initBankAccount("uah", 200);
        ElectronicWallet eWallet = ElectronicWallet.initWalletAccount("bnb", -50);
        ElectronicWallet eWallet1 = ElectronicWallet.initWalletAccount("red", 50);
        ElectronicWallet eWallet2 = ElectronicWallet.initWalletAccount("bio", 20);

        System.out.println("\n====================");
        PaymentSystem[] paymentSystems = {bankAcc, bankAcc1, eWallet2, eWallet, bankAcc2, eWallet1};
        Random random = new Random();
        for (int i = 0; i < paymentSystems.length; i++) {
            if (paymentSystems[i] != null) {
                paymentSystems[i].checkBalance();
                paymentSystems[i].depositTransfer(i * random.nextInt(-5, 11));
                paymentSystems[i].withdrawMoney(i * random.nextInt(-5, 11));

                if (i > 0 && paymentSystems[i - 1] instanceof Account) {
                    System.out.println("\n========Transfer============");
                    paymentSystems[i].transferMoney(10, (Account) paymentSystems[i - 1]);
                }

                System.out.println("=============================");
            }
        }


    }
}
