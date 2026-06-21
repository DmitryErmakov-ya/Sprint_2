package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double  getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double base = item.getAmount() * item.getPrice();
            double discountPercent = item.getDiscount();
            double withDiscount = base * (1.0 - discountPercent / 100.0);
            total += withDiscount;
        }
        return total;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
