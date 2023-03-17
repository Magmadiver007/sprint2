package model;
import static model.constants.Discount.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }



    @Override
    public double getDiscount() {
        if (this.colour.equals("red")) {
            return DISCOUNT;
        } else {
            return 0;
        }
    }

}
