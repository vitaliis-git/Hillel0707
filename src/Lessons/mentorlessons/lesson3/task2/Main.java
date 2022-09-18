package Lessons.mentorlessons.lesson3.task2;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Ivanov", "Ivan", "Kyiv, Ukraine", "1000");
        Customer customer = new Customer("Petrenko", "Petro", "London, Great Britain", "1234567890");
        employee.display();
        System.out.println("---------------------------------");
        customer.display();
    }
}
