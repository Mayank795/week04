package Collectionframework.insurancepolicymanagementsystemamap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>(); // Fast retrieval by policy number
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>(); // Maintains insertion order
    private TreeMap<LocalDate, Policy> expirySortedPolicies = new TreeMap<>(); // Sorted by expiry date

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        expirySortedPolicies.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by policy number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        for (Map.Entry<LocalDate, Policy> entry : expirySortedPolicies.entrySet()) {
            if (entry.getKey().isAfter(today) && entry.getKey().isBefore(threshold)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyholderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        expirySortedPolicies.headMap(today, true).clear(); // Remove expired policies
        policyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
        orderedPolicyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
    }

    // Display all policies (LinkedHashMap maintains order)
    public void displayAllPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy(new Policy("P1001", "Alice", LocalDate.now().plusDays(10), "Health", 500.0));
        system.addPolicy(new Policy("P1002", "Bob", LocalDate.now().plusDays(40), "Auto", 700.0));
        system.addPolicy(new Policy("P1003", "Alice", LocalDate.now().plusDays(20), "Home", 1000.0));
        system.addPolicy(new Policy("P1004", "Charlie", LocalDate.now().minusDays(5), "Auto", 800.0));

        System.out.println("\n All Policies:");
        system.displayAllPolicies();

        System.out.println("\n Policies Expiring Soon:");
        System.out.println(system.getExpiringPolicies());

        System.out.println("\n Policies for Alice:");
        System.out.println(system.getPoliciesByHolder("Alice"));

        System.out.println("\n Removing Expired Policies...");
        system.removeExpiredPolicies();

        System.out.println("\n Updated Policies:");
        system.displayAllPolicies();
    }
}
