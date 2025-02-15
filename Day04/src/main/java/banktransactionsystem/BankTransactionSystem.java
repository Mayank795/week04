package banktransactionsystem;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    private double balance;

    public BankTransactionSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);

        try {
            System.out.println("Attempting to withdraw 200...");
            account.withdraw(200);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());

            System.out.println("Attempting to withdraw 1500...");
            account.withdraw(1500);

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

