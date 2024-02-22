import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private LocalDate dateOfJoining;

    public Employee(String name, double salary, LocalDate dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[10];

        // Initialize the array with employee information
        employees[0] = new Employee("John Doe", 50000, LocalDate.of(2020, 5, 15));
        employees[1] = new Employee("Jane Smith", 60000, LocalDate.of(2019, 8, 20));
        employees[2] = new Employee("Michael Johnson", 55000, LocalDate.of(2021, 2, 10));
        employees[3] = new Employee("Emily Brown", 52000, LocalDate.of(2018, 10, 5));
        employees[4] = new Employee("David Wilson", 58000, LocalDate.of(2020, 12, 30));
        employees[5] = new Employee("Sarah Lee", 63000, LocalDate.of(2017, 6, 25));
        employees[6] = new Employee("Christopher Davis", 54000, LocalDate.of(2019, 3, 12));
        employees[7] = new Employee("Amanda Martinez", 59000, LocalDate.of(2022, 1, 8));
        employees[8] = new Employee("James Taylor", 51000, LocalDate.of(2016, 9, 18));
        employees[9] = new Employee("Lauren Rodriguez", 62000, LocalDate.of(2018, 11, 3));

        // Print information of all employees
        System.out.println("Name \t\t Salary \t Date of Joining");
        System.out.println("===============================================");
        for (Employee emp : employees) {
            System.out.printf("%-15s %-10.2f %s\n", emp.getName(), emp.getSalary(), emp.getDateOfJoining());
        }
    }
}
