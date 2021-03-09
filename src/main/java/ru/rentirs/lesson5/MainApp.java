package ru.rentirs.lesson5;

public class MainApp {
    public static void main(String[] args) {
        isAgeOverForty(isCreateDataBase());
    }

    public static Employee[] isCreateDataBase() {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emplArray[1] = new Employee("Petrov Petr", "Developer", "pepetr@mailbox.com", "892312313", 60000, 42);
        emplArray[2] = new Employee("Sidorov Sidor", "HR-manager", "sisidor@mailbox.ru", "892312314", 35000, 21);
        emplArray[3] = new Employee("Vasechkin Vasiliy", "PR-manager", "vavas@mailbox.ru", "892312315", 40000, 35);
        emplArray[4] = new Employee("Brezhnev Michail", "Plumber", "mibrezh@mailbox.ru", "892312310", 25000, 61);
        return emplArray;
    }

    public static void isAgeOverForty(Employee[] emplArray) {
        for (Employee employee : emplArray) {
            if (employee.getAge() > 40) {
                employee.employeeInfo();
            }
        }
    }
}
