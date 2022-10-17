public class Employee {
    private static int counter = 0;
    private String name;
    private String lastName;
    private String middleName;
    private int salary;
    private static Integer id;
    private int department;

    public Employee(String name, String lastName, String middleName, int department, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter;
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

    public static int getId() {
        return id;
    }

    public int getSalary() { return salary;}

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String  toString(){
        return Employee
    }
}
