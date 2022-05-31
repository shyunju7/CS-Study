package factorymethod;

public class BulgogiPizzaShop implements PizzaShopFactory{

    @Override
    public Pizza createPizza(String pizzaName) {
        return new BulgogiPizza(pizzaName);
    }
}
