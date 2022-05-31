package observer;

public class HJ implements Customer {
    public String name;

    public HJ(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(msg);
    }

    @Override
    public String getName() {
        return name;
    }

}
