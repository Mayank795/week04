package readinput;

import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {
        String filename = "user_info.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filename, true)) { // Append mode

            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("----------------------\n");

            System.out.println("User information saved successfully in " + filename);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a number.");
        }
    }
}

