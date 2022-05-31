package observer;

public class YJ implements Customer {

    public String name;

    public YJ(String name) {
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
