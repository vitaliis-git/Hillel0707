package Homeworks.homework23.abstractClassTask;

public class Main {

    public static void main(String[] args) {
        FizOsoba fizOsoba = new FizOsoba(0,0,0,0);
        fizOsoba.displayAccountConditions();
        System.out.println("----------------------------------------------------------------");

        Fop fop = new Fop(1, 0.5f, 0, 1000, 0);
        fop.displayAccountConditions();
        System.out.println("----------------------------------------------------------------");

        YurOsoba yurOsoba = new YurOsoba(0,1,0,0);
        yurOsoba.displayAccountConditions();
    }
}
