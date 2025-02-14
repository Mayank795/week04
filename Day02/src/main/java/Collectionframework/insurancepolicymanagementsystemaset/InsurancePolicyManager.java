package Collectionframework.insurancepolicymanagementsystemaset;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    // Add Policy to all Sets
    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Get all unique policies
    public void displayAllPolicies() {
        System.out.println("\nAll Policies (HashSet):");
        hashSetPolicies.forEach(System.out::println);
    }

    // Get Policies expiring within the next 30 days
    public void getExpiringSoon() {
        LocalDate today = LocalDate.now();
        System.out.println("\nPolicies Expiring Soon:");
        treeSetPolicies.stream()
                .filter(policy -> ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30)
                .forEach(System.out::println);
    }

    // Get Policies by Coverage Type
    public void getPoliciesByCoverage(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        hashSetPolicies.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    // Find Duplicate Policies by Policy Number
    public void findDuplicates() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (Policy policy : hashSetPolicies) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        System.out.println("\nDuplicate Policies:");
        policyCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Policy Number: " + entry.getKey() + ", Count: " + entry.getValue()));
    }

    // Performance Comparison
    public void performanceTest() {
        System.out.println("\nPerformance Test:");
        int numOperations = 100000;

        // Measure HashSet performance
        long start = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            hashSetPolicies.contains(new Policy("P" + i, "Test", LocalDate.now(), "Auto", 1000));
        }
        long end = System.nanoTime();
        System.out.println("HashSet lookup time: " + (end - start) / 1_000_000 + " ms");

        // Measure LinkedHashSet performance
        start = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedHashSetPolicies.contains(new Policy("P" + i, "Test", LocalDate.now(), "Auto", 1000));
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet lookup time: " + (end - start) / 1_000_000 + " ms");

        // Measure TreeSet performance
        start = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            treeSetPolicies.contains(new Policy("P" + i, "Test", LocalDate.now(), "Auto", 1000));
        }
        end = System.nanoTime();
        System.out.println("TreeSet lookup time: " + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Sample Policies
        manager.addPolicy(new Policy("P1", "John Doe", LocalDate.of(2024, 3, 20), "Health", 500));
        manager.addPolicy(new Policy("P2", "Jane Smith", LocalDate.of(2024, 3, 15), "Auto", 700));
        manager.addPolicy(new Policy("P3", "Alice Brown", LocalDate.of(2024, 6, 10), "Home", 1200));
        manager.addPolicy(new Policy("P4", "Bob White", LocalDate.of(2024, 3, 1), "Health", 450));
        manager.addPolicy(new Policy("P1", "John Doe", LocalDate.of(2024, 3, 20), "Health", 500)); // Duplicate

        // Display all policies
        manager.displayAllPolicies();

        // Display policies expiring soon
        manager.getExpiringSoon();

        // Get policies by coverage type
        manager.getPoliciesByCoverage("Health");

        // Find duplicates
        manager.findDuplicates();

        // Performance Test
        manager.performanceTest();
    }
}

