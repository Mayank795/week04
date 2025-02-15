package regexproblem.advancedproblem.ipaddressvalidator;
import java.util.regex.Pattern;
public class IPAddressValidator {

    private static final String IP_ADDRESS_PATTERN =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static boolean isValidIP(String ipAddress) {
        return Pattern.matches(IP_ADDRESS_PATTERN, ipAddress);
    }

    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        System.out.println(isValidIP(ipAddress) ? "Valid" : "Invalid");
    }
}

