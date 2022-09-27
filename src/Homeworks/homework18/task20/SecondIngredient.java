package Homeworks.homework18.task20;

import java.util.Scanner;

public class SecondIngredient extends Burger {
    int sous;
    int cheese;
    int kotleta;
    int secondIngredient;

    public SecondIngredient(int sous, int cheese, int kotleta) {
        this.sous = sous;
        this.cheese = cheese;
        this.kotleta = kotleta;
    }

    @Override
    public void builder() {
        System.out.println("Хотите ли вы добавить второй ингредиент для бургера?");
        System.out.println("1. Соус - 10");
        System.out.println("2. Сыр - 20");
        System.out.println("3. Котлета - 30");
        System.out.print("Введите название или номер второго ингредиента, или введите Нет, если вы не хотите второй ингредиент: ");

        Scanner scanner2 = new Scanner(System.in);
        String secondSelection = scanner2.nextLine();
        if (secondSelection.equals(String.valueOf(1)) || secondSelection.equalsIgnoreCase("Соус")) {
            this.secondIngredient = this.sous;
        }
        if (secondSelection.equals(String.valueOf(2)) || secondSelection.equalsIgnoreCase("Сыр")) {
            this.secondIngredient = this.cheese;
        }
        if (secondSelection.equals(String.valueOf(3)) || secondSelection.equalsIgnoreCase("Котлета")) {
            this.secondIngredient = this.kotleta;
        }
        if (secondSelection.equals("Нет")) {
            this.secondIngredient = 0;
        }
    }
}
