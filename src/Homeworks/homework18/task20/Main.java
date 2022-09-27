package Homeworks.homework18.task20;

public class Main {

    public static void main(String[] args) {

        FirstIngredient firstIngredient = new FirstIngredient(10, 20, 30);
        SecondIngredient secondIngredient = new SecondIngredient(10, 20, 30);
        firstIngredient.builder();
        secondIngredient.builder();
        int burger = 50;
        System.out.println("Стоимость вашего бургера = " + (burger + firstIngredient.firstIngredient + secondIngredient.secondIngredient));
    }
}
