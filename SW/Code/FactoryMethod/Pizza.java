package factorymethod;

public abstract class Pizza {

    public String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getPizzaName() {
        return name;
    }
}
