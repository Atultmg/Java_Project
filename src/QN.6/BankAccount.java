class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner   = owner;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: $" + amt);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid amount! Must be greater than 0.");
        } else if (amt > balance) {
            System.out.println("Insufficient funds! Balance: $" + balance);
        } else {
            balance -= amt;
            System.out.println("Withdrawn: $" + amt);
        }
    }

    public void printBalance() {
        System.out.println(owner + "'s Balance: $" + balance);
    }
}