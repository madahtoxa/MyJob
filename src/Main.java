import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", "Ivanovich", "Ivanov", 1, 55000);
        Employee e2 = new Employee("Petr", "Petrovich", "Petrov", 1, 45000);
        Employee e3 = new Employee("Anton", "Antonovich", "Antonov", 1, 135000);
        Employee e4 = new Employee("Vasiliy", "Vasilevich", "Vasilev", 1, 47000);
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        Employee[] emp = Arrays.copyOf(employees, 10);
        Arrays.stream(emp).forEach(System.out::println);

        printEmployee();
        System.out.println("Сумма всех зарплат - " + calcTotalSalary());
        System.out.println("Самая высокая ЗП - " + findMaxSalary());
        System.out.println("Самая низкая ЗП - " + findMinSalary());
        System.out.println("Средняя ЗП составляет - " + calcAverageSalary());
        printFullNames();
    }

    public static void printEmployee() {
        for (Employee employee : employees) {
            calcTotalSalary();
        }
    }

    public static int calcTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static int findMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public static int findMinSalary() {
        int min = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }

    public static float calcAverageSalary() {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                sum += employee.getSalary();
            }
        }
        return (float) sum / count;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getMiddleName() + " " + employee.getLastName());
            }
        }
    }

}