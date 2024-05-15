package StreamDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public String getDepartment() {
    return this.department;
  }

  public double getSalary() {
    return this.salary;
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    

    employees.stream().filter(e -> e.getSalary() >= 60000 && "IT".equals(e.getDepartment())).map(e -> e.getName()).collect(Collectors.toList());
  }
}
