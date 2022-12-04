package by.step.java.core.finaly.project.service.employee;

public class EmployeeModel {
    private int id;
    private String fio;
    private int age;
    private double salary;

    public EmployeeModel(int id, String fio, int age, double salary) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public EmployeeModel(int id, String fio, int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
