package banktransactionsystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionSystemTest {

    @Test
    public void testValidWithdrawal() throws InsufficientBalanceException {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);
        account.withdraw(200);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    public void testInsufficientBalance() {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(1500);  // Insufficient balance
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    public void testInvalidAmount() {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }
}

