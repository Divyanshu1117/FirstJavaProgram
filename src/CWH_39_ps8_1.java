class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class CWH_39_ps8_1 {
    public static void main(String[] args) {
        Employee1 cold = new Employee1();
        cold.setName("Coldzero");
        cold.salary = 500;
        System.out.println(cold.getName());
        System.out.println(cold.getSalary());
    }
}