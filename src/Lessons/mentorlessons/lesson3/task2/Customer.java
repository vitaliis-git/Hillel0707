package Lessons.mentorlessons.lesson3.task2;

public class Customer extends Person {
    private String account;

    public Customer(String lastName, String firstName, String address, String account) {
        super(lastName, firstName, address);
        this.account = account;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.account + " bank account number");
    }
}
