public class EmployeeService {
    private Employee[] employees;
    private int count;

    public EmployeeService(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < count; i++) {
                employees[i].display();
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
