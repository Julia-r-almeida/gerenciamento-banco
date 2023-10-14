public class Account {
    private Double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void getBalance() {
        System.out.println("Saldo: " + this.balance);
    }

    public void withdraw(double value) {
        if (value > this.balance) {
            System.out.println("O saque não pode ser realizado, o valor solicitado é maior que o valor em conta");
        } else {
            this.balance -= value;
            System.out.println("Saque realizado com sucesso!");

        }
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("Depósito realizado com sucesso");
    }
}