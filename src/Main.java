public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee[] all = new Employee[10];
        System.out.println();
        System.out.println(e1.getSalary());
        e1.setSalary(45000);
        System.out.println(e1.getSalary());
    }
}