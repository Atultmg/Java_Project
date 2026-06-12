// The 'ATM Simulation' (Encapsulation)
public class ATMSimulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Atul", 100000.0);

        System.out.println("--- ATM Simulation ---\n");

        account.printBalance();

        System.out.println();
        account.deposit(500);
        account.printBalance();

        System.out.println();
        account.withdraw(200);
        account.printBalance();

        System.out.println();
        account.withdraw(5000);
        account.withdraw(-50);
        account.printBalance();
    }
}