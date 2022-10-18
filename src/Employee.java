public class Employee {
    private static int counter = 0;
    private Integer id;
    private String name;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String name, String middleName, String lastName, int department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public Integer getId() {
        return this.id;
    }

    public int getSalary() {return salary;}

    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + id + '\'' +
                "Имя'" + name + '\'' +
                "Фамилия='" + lastName + '\'' +
                "Отчество='" + middleName + '\'' +
                "Отдел='" + department +
                "Зарплата='" + salary + '\'' +
                '}';

    }
}
