package serialization;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    private static final String FILE_NAME = "employees.dat";

    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public static List<Employee> deserializeEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Alice", "HR", 50000));
        employeeList.add(new Employee(2, "Bob", "IT", 60000));
        employeeList.add(new Employee(3, "Charlie", "Finance", 55000));

        // Serialize employees
        serializeEmployees(employeeList);

        // Deserialize employees and print them
        List<Employee> deserializedEmployees = deserializeEmployees();
        for (Employee emp : deserializedEmployees) {
            System.out.println(emp);
        }
    }
}

