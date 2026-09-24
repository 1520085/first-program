package service;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] eating; //поле-массив Еды

    public ShoppingCart(Food[] eating){ //конструктор созлания корзины
        this.eating=eating;
    }
    public double priceWithoutDiscount(){ //без скидки
        double summ = 0; //сумма корзины

        for (Food food:eating)
        {
            summ = summ+food.getAmount()*food.getPrice(); // Сумма=сумма+кол-во * цена
        }
        return summ;
    }
    public double priceWithDiscount()
    {
        double summ = 0;
        for (Food food:eating){
            double foodPriceWithoutDiscount = food.getAmount()* food.getPrice();
            //Добавлено для фикса (Удаление метода getDiscount из Food.java) c подсказками от ИИ {
            double discountPercent=0;
            if (food instanceof Discountable){
                discountPercent=(((Discountable) food).getDiscount());
            }
            //  }

            double foodPriceWithDiscount=foodPriceWithoutDiscount*(1-discountPercent/100);
            summ=summ+foodPriceWithDiscount;
        }
        return summ;
    }
    public double vegPriceWithoutDiscount()
    {
        double summ=0;
    for (Food food:eating){
        if (food.isVegetarian()){
            summ=summ+food.getAmount()* food.getPrice();
        }
    }
    return summ;
    }
}
