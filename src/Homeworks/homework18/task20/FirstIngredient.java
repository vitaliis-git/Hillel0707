package Homeworks.homework18.task20;

import java.util.Scanner;

public class FirstIngredient extends Burger {

    int sous;
    int cheese;
    int kotleta;
    int firstIngredient;

    public FirstIngredient(int sous, int cheese, int kotleta) {
        this.sous = sous;
        this.cheese = cheese;
        this.kotleta = kotleta;
    }

    @Override
    public void builder() {
        System.out.println("Выберите первый дополнительный ингредиент для бургера");
        System.out.println("1. Соус - 10");
        System.out.println("2. Сыр - 20");
        System.out.println("3. Котлета - 30");
        System.out.print("Введите название или номер ингредиента: ");

        Scanner scanner1 = new Scanner(System.in);
        String firstSelection = scanner1.nextLine();

        if (firstSelection.equals(String.valueOf(1)) || firstSelection.equalsIgnoreCase("Соус")) {
            this.firstIngredient = this.sous;
        }
        if (firstSelection.equals(String.valueOf(2)) || firstSelection.equalsIgnoreCase("Сыр")) {
            this.firstIngredient = this.cheese;
        }
        if (firstSelection.equals(String.valueOf(3)) || firstSelection.equalsIgnoreCase("Котлета")) {
            this.firstIngredient = this.kotleta;
        }
    }
}
