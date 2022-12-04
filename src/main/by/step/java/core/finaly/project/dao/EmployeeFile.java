package by.step.java.core.finaly.project.dao;

import by.step.java.core.finaly.project.service.employee.EmployeeModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile extends FileDAO {

    @Override
    public List readFile() {
        List<EmployeeModel> employees = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\employees.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                employees.add(new EmployeeModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        Double.parseDouble(tempArray[3])
                        )

                );

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
