package Casestudy.models;

import Casestudy.commoms.FunReadAndWrite;

import java.util.*;

public class Employee {
    private String nameEmployee;
    private int age;
    private String address;

    public Employee(String nameEmployee, int age, String address) {
        this.nameEmployee = nameEmployee;
        this.age = age;
        this.address = address;
    }

    public Employee(String[] employee) {
        this.nameEmployee = employee[0];
        this.age = Integer.parseInt(employee[1]);
        this.address = employee[2];
    }

    public Employee() {

    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void showEmployee() {
        TreeMap<String, Employee> employeeMap = new TreeMap<>();
        List<String[]> employeeList = FunReadAndWrite.readFile("Employee.csv");
        String temp = "";
        String[] strings;
        for (int i = 0; i < employeeList.size(); i++) {
            strings=employeeList.get(i);
            Employee employee = new Employee(strings);
            if (i < 9) {
                temp = "00" + (i + 1);
                employeeMap.put(temp, employee);
            } else {
                temp = "010";
                employeeMap.put(temp, employee);
            }

        }

        Set<String> set=employeeMap.keySet();
        for (String key : set){
            System.out.println(key+", "+ employeeMap.get(key));
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
