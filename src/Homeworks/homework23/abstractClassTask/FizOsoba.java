package Homeworks.homework23.abstractClassTask;

public class FizOsoba extends Client {
    public FizOsoba(int replenishmentFee, int withdrawalFee, int feeLimit, float balance) {
        super(replenishmentFee, withdrawalFee, feeLimit, balance);
    }

    @Override
    public void displayAccountConditions() {
        System.out.println("Условия обслуживания счетов физических лиц:");
        if (super.replenishmentFee == 0) {
            System.out.println("Комиссия за пополнение счета отсутствует");
        } else {
            System.out.println("Комиссия за пополнение счета составляет " + super.replenishmentFee + "% от суммы пополнения");
        }
        if (super.withdrawalFee == 0) {
            System.out.println("Комиссия за снятие денег со счета отсутствует");
        } else {
            System.out.println("Комиссия за снятие денег со счета составляет " + super.withdrawalFee + "% от суммы снятия");
        }
        System.out.println("Баланс счета составляет " + super.balance + "$");
        }
    }
