package Collectionframework.mapinterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filename = "input.txt"; // Change this to your file path
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Normalize: Convert to lowercase & remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                // Split by whitespace
                String[] words = line.split("\\s+");

                // Count words
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display word frequency
        System.out.println("Word Frequencies: " + wordCount);
    }
}
