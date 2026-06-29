package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT_PERCENT;
        }
        return 0.0;
    }
}