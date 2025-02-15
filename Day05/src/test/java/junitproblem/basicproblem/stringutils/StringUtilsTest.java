package junitproblem.basicproblem.stringutils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}
