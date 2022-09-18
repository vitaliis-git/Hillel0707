package Lessons.mentorlessons.lesson3.task2;

public class Employee extends Person{

    private String salary;

    public Employee(String lastName, String firstName, String address, String salary) {
        super(lastName, firstName, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.salary + " salary amount");
    }
}
