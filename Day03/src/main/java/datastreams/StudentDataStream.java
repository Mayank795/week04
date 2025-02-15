package datastreams;

import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    public static void writeStudentData(int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Writing student data
        writeStudentData(101, "Alice", 8.5);
        writeStudentData(102, "Bob", 9.1);

        // Reading student data
        System.out.println("Reading student data:");
        readStudentData();
    }
}

