package Homeworks.homework23.abstractClassTask;

public abstract class Client {
    int replenishmentFee;
    int withdrawalFee;
    int feeLimit;
    float balance;

    public Client(int replenishmentFee, int withdrawalFee, int feeLimit, float balance) {
        this.replenishmentFee = replenishmentFee;
        this.withdrawalFee = withdrawalFee;
        this.feeLimit = feeLimit;
        this.balance = balance;
    }

    public abstract void displayAccountConditions();
}
