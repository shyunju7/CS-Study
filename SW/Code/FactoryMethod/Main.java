package factorymethod;

public class Main {

    public static void main(String[] args) {

        PizzaShopFactory bulPizzaShop = new BulgogiPizzaShop();
        Pizza bulgogiPizza = bulPizzaShop.createPizza("불불피자");
        System.out.println(bulgogiPizza.getPizzaName());
    }
}

/** 출력
 * 불불피자
 * */
