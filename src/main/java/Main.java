public class Main {
    public static void main(String[] args) {
        model.Meat meat = new model.Meat(5, 100);
        model.Apple redApple = new model.Apple(10, 50, model.constants.Colour.RED);
        model.Apple greenApple = new model.Apple(8, 60, model.constants.Colour.GREEN);

        model.Food[] products = {meat, redApple, greenApple};

        service.ShoppingCart shoppingCart = new service.ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.2f рублей%n", shoppingCart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей%n", shoppingCart.getTotalWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f рублей%n", shoppingCart.getTotalVegetarianWithoutDiscount());
    }
}