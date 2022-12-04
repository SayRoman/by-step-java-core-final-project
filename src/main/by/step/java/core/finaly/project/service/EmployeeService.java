package by.step.java.core.finaly.project.service;


import by.step.java.core.finaly.project.dao.EmployeeFile;
import by.step.java.core.finaly.project.dao.FileDAO;
import by.step.java.core.finaly.project.service.employee.EmployeeModel;

import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<EmployeeModel> employees;
    private FileDAO employeeFile = new EmployeeFile();

    public EmployeeService() {
        this.employees = (ArrayList<EmployeeModel>) employeeFile.readFile();
    }

    public boolean addNewEmployee(EmployeeModel employeeModel) {
        employees.add(employeeModel);
        ArrayList <String> convertedCollection = convertEmployeesToString();
         return employeeFile.saveFile(convertedCollection, "employees");
    }

    private ArrayList<String> convertEmployeesToString() {
        ArrayList<String> strings = new ArrayList<>();
        for (EmployeeModel model : employees) {
            strings.add(model.getId() + "," + model.getFio() + "," + model.getAge() + "," + model.getSalary());
        }
        return strings;
    }
}
