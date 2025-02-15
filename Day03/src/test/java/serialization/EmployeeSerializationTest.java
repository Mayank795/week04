package serialization;

import org.junit.jupiter.api.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSerializationTest {
    private static final String TEST_FILE = "employees.dat";

    @BeforeEach
    void setUp() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ankit", "Engineering", 75000));
        employees.add(new Employee(102, "Anand Soni", "Marketing", 68000));

        EmployeeSerialization.serializeEmployees(employees);
    }

    @Test
    void testSerializationAndDeserialization() {
        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();

        assertNotNull(deserializedEmployees);
        assertEquals(2, deserializedEmployees.size());

        assertEquals(101, deserializedEmployees.get(0).getId());
        assertEquals("Ankit", deserializedEmployees.get(0).getName());
        assertEquals("Engineering", deserializedEmployees.get(0).getDepartment());
        assertEquals(75000, deserializedEmployees.get(0).getSalary());

        assertEquals(102, deserializedEmployees.get(1).getId());
        assertEquals("Anand Soni", deserializedEmployees.get(1).getName());
        assertEquals("Marketing", deserializedEmployees.get(1).getDepartment());
        assertEquals(68000, deserializedEmployees.get(1).getSalary());
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }
}
