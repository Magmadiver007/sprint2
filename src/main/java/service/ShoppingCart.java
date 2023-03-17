package service;

import model.Food;
import static model.constants.Discount.*;


public class ShoppingCart {
    private Food[] foods;
    private double price;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    public double getSumWithDiscount() {

        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            this.price = foods[i].getAmount() * foods[i].getPrice();
            if (foods[i].getDiscount() != 0){
                sum = sum + (price-((price)/100*DISCOUNT));
            } else {
                sum = sum + (price);
            }
        }

        return sum;

    }

    public double getSumWithOutDiscount() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            this.price = foods[i].getAmount() * foods[i].getPrice();
            sum = sum + (price);
        }
        return sum;
    }

    public double getVeganSumWithOutDiscount() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            this.price = foods[i].getAmount() * foods[i].getPrice();
            if (foods[i].isVegetarian()) {
                sum = sum + (price);
            }
        }
        return sum;
    }
}