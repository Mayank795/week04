package Collectionframework.queueinterface;

import java.util.*;

class Patient implements Comparable<Patient> {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() { return name; }
    public int getSeverity() { return severity; }

    // Sorting patients in descending order of severity
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class TriageSystem {
    public static void main(String[] args) {
        // Using a PriorityQueue for triage (max-heap behavior)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Treating patients in order of severity
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
