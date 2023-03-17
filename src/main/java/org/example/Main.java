package org.example;
import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50, COLOUR_RED);
        Apple greenApple = new Apple(8,60, COLOUR_GREEN);

        Food[] foods = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %s%n",shoppingCart.getSumWithOutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %s%n",shoppingCart.getSumWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %s%n", shoppingCart.getVeganSumWithOutDiscount());
    }
}