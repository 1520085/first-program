package model;

import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food implements Discountable{

    private String color;

    public Apple(int amount, double price, String color) {
        super(amount,price,true);
        this.color=color;
    }
    @Override //Если красные - скидка 60, иначе 0
    public double getDiscount(){
        if (Colour.RED.equals(color)) {
            return Discount.RED_APPLE_DISCOUNT_PERCENT;
        }
        return 0;
    }
}
