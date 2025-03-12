package homeworks.homework_30.task2_3;

public abstract class Account {
    private String currency;
    private double balance;

    public Account(String currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

//    @Override
    public void withdrawMoney(double amount) {
        if (amount < 0) {
            System.out.printf("Сумма %.2f меньше нуля. Снятие невозможно\n", amount);
            return;
        }
        if (this.balance < amount) {
            System.out.printf("Недостаточно денег для снятия %.2f %s\n", amount, this.currency);
            this.checkBalance();
            return;
        }
        this.balance -= amount;
        System.out.printf("Со счёта снято %.2f %s\n", amount, this.currency);
        this.checkBalance();
    }

//    @Override
    public void depositTransfer(double amount) {
        if (amount < 0) {
            System.out.printf("Сумма %.2f меньше нуля. Пополнение невозможно\n", amount);
            return;
        }
        this.balance += amount;
        System.out.printf("Пополнение счета на сумму %.2f %s\n", amount, this.currency);
        this.checkBalance();
    }

//    @Override
    public void checkBalance() {
        System.out.printf("Остаток на счёту: %.2f %s\n", this.balance, this.currency);
    }

    public void transferMoney(double amount, Account toAccount) {
        if (amount < 0) {
            System.out.printf("Сумма %.2f меньше нуля. Перевод невозможен\n", amount);
            return;
        }
        if (this.balance < amount) {
            System.out.printf("Недостаточно денег для перевода %.2f %s\n", amount, this.currency);
            this.checkBalance();
            return;
        }
        toAccount.depositTransfer(amount);
        this.balance -= amount;
        System.out.printf("Со счёта осуществлен перевод на сумму %.2f %s\n", amount, this.currency);
        this.checkBalance();
    }


}
