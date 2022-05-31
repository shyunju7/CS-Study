package facade;

// facade 역할을 할 클래스
public class Hamburger {
    public void makeHamburger(){

        Bread bread = new Bread();
        Meat meat = new Meat();
        Lettuce lettuce = new Lettuce();
        Tomato tomato = new Tomato();

        bread.cook();
        meat.cook();
        lettuce.cook();
        tomato.cook();
        bread.cook();
    }
}
