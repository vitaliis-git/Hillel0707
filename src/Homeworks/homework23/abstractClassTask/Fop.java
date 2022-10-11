package Homeworks.homework23.abstractClassTask;

public class Fop extends Client {
    float secondRelpenishmentFee;

    public Fop(int replenishmentFee, float secondRelpenishmentFee, int withdrawalFee, int feeLimit, float balance) {
        super(replenishmentFee, withdrawalFee, feeLimit, balance);
        this.secondRelpenishmentFee = secondRelpenishmentFee;
    }

    @Override
    public void displayAccountConditions() {
        System.out.println("Условия обслуживания счетов физических лиц предпринимателей:");
        if (super.replenishmentFee == 0) {
            System.out.println("Комиссия за пополнение счета отсутствует");
        } else {
            if (super.feeLimit == 0) {
                System.out.println("Комиссия за пополнение счета составляет " + super.replenishmentFee + "% от суммы пополнения");
            } else {
                System.out.println("Комиссия за пополнение составляет " + super.replenishmentFee + "%, если сумма пополнения меньше " + super.feeLimit + "$");
                System.out.println("Комиссия за пополнение составляет " + this.secondRelpenishmentFee + "%, если сумма пополнения больше либо равна " + super.feeLimit + "$");
            }
        }
        if (super.withdrawalFee == 0) {
            System.out.println("Комиссия за снятие денег со счета отсутствует");
        } else {
            System.out.println("Комиссия за снятие денег со счета составляет " + super.withdrawalFee + "% от суммы снятия");
        }
        System.out.println("Баланс счета составляет " + super.balance + "$");
    }
}
