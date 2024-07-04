package streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

}

public class FilterAndMap {
    public static void main(String[] args) {
    // filter salary > 1000 and print name who has salary > 1000
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rama", 1000),
                new Employee(2, "Krish", 20000),
                new Employee(3, "Ramya", 40000),
                new Employee(4, "Ramyana", 50000),
                new Employee(5, "bhaamya", 490000),
                new Employee(3, "Namya", 40000));

    employees.stream().filter(n->n.salary>1000).map(n->n.empName).forEach(n-> System.out.println(n));
    }
}
