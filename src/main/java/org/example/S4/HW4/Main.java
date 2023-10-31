package org.example.S4.HW4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new EmployeeDirectory.Employee(1, "89500000000", "Андрей", 5));
        directory.addEmployee(new EmployeeDirectory.Employee(2, "89510000000", "Дмитрий", 3));
        directory.addEmployee(new EmployeeDirectory.Employee(3, "89520000000", "Артем", 10));
        directory.addEmployee(new EmployeeDirectory.Employee(4, "89530000000", "Олег", 20));
        directory.addEmployee(new EmployeeDirectory.Employee(5, "89540000000", "Александр", 25));

        printByExperience(5, directory);
        System.out.println();
        printPhoneByName("Дмитрий", directory);
        System.out.println();
        printByEmployeeId(3, directory);
    }

    public static void printByExperience (int experience, EmployeeDirectory directory){
        List<EmployeeDirectory.Employee> employeesWithExperience = directory.searchByExperience(experience);
        System.out.printf("Сотрудники со стажем %d лет:\n", experience);
        for (EmployeeDirectory.Employee employee : employeesWithExperience) {
            System.out.println("Табельный номер: " + employee.getId() + ", Имя: " + employee.getName());
        }
    }

    public static void printPhoneByName (String name, EmployeeDirectory directory){
        List<String> phoneNumbers = directory.searchPhoneByName(name);
        System.out.printf("Номера телефонов сотрудника по имени %s:\n", name);
        for (String phoneNumber : phoneNumbers) {
            System.out.println("Номер телефона: " + phoneNumber);
        }
    }

    public static void printByEmployeeId (int id, EmployeeDirectory directory){
        EmployeeDirectory.Employee employeeId = directory.searchByEmployeeId(id);
        if (employeeId != null) {
            System.out.printf("Сотрудник с табельным номером %d:\n", id);
            System.out.println("Имя: " + employeeId.getName() + ", Номер телефона: " + employeeId.getPhone());
        } else {
            System.out.printf("Сотрудник с табельным номером %d не найден.", id);
        }
    }
}
