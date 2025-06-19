public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService(10);

        service.addEmployee(new Employee(101, "Ravi", "Developer", 55000));
        service.addEmployee(new Employee(102, "Sneha", "Manager", 70000));
        service.addEmployee(new Employee(103, "Amit", "Tester", 40000));

        System.out.println("\n All Employees:");
        service.displayAllEmployees();

        System.out.println("\n Searching for Employee ID 102:");
        Employee emp = service.searchEmployee(102);
        if (emp != null) emp.display();
        else System.out.println("Employee not found.");

        System.out.println("\n Deleting Employee ID 101:");
        service.deleteEmployee(101);

        System.out.println("\n Employees After Deletion:");
        service.displayAllEmployees();
    }
}
