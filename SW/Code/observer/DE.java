package observer;

public class DE implements Customer {

    public String name;

    public DE(String name) {
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
