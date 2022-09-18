package Lessons.mentorlessons.lesson3.task2;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String address;

    public Person(String lastName, String firstName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public void display() {
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println(this.address);
    }
}
