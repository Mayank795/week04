package regexproblem.advancedproblem.ipaddressvalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.advancedproblem.ipaddressvalidator.IPAddressValidator;

public class IPAddressValidatorTest {
    @Test
    public void testValidIP() {
        assertTrue(IPAddressValidator.isValidIP("192.168.1.1"));
    }
    @Test
    public void testInvalidIP() {
        assertFalse(IPAddressValidator.isValidIP("256.256.256.256"));
    }
    @Test
    public void testInvalidIPTooFewOctets() {
        assertFalse(IPAddressValidator.isValidIP("192.168.1"));
    }
    @Test
    public void testInvalidIPTooManyOctets() {
        assertFalse(IPAddressValidator.isValidIP("192.168.1.1.1"));
    }
}
