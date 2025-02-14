package Collectionframework.votingsystem;
import java.util.*;
class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>(); // Candidate -> Votes (Fast Lookup)
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>(); // Maintains insertion order
    private TreeMap<Integer, List<String>> sortedResults = new TreeMap<>(Collections.reverseOrder()); // Sorts by votes (Descending)

    // Cast a vote
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate)); // Update LinkedHashMap

        updateSortedResults();
    }

    // Update the sorted results in TreeMap
    private void updateSortedResults() {
        sortedResults.clear();
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            sortedResults.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
    }

    // Display votes in insertion order
    public void displayVotesInOrder() {
        System.out.println("\n🗳️ Votes in Insertion Order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Display votes sorted by count (Descending)
    public void displaySortedResults() {
        System.out.println("\n🏆 Sorted Voting Results:");
        for (Map.Entry<Integer, List<String>> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " votes: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Simulating votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display results
        votingSystem.displayVotesInOrder();
        votingSystem.displaySortedResults();
    }
}
