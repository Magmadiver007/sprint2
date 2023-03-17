package model;

public abstract class Food implements Discountable{
    protected int amount;
    public double price;
    boolean isVegetarian;

    public int getAmount(){
        return this.amount;
    }

    public double getPrice(){
        return this.price;
    }
    public boolean isVegetarian(){
        return this.isVegetarian;
    }

    public abstract double getDiscount();
}
