package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Получить общую сумму товаров в корзине без скидки
    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Получить общую сумму товаров в корзине со скидкой
    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double price = item.getTotalPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                price *= (1 - discount / 100);
            }
            total += price;
        }
        return total;
    }

    // Получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}
