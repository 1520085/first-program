import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] products = new Food[]{meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);
        //
        System.out.println("Сумма товаров без скидки: " + cart.priceWithoutDiscount() + " руб.");
        System.out.println("Сумма товаров со скидкой " + cart.priceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки " + cart.vegPriceWithoutDiscount() + " руб.");
    }
}