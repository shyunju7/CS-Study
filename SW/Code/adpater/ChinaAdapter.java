package adpater;

// 어댑터
public class ChinaAdapter extends China implements Greet{

    @Override
    public void greet() {
        nihao();
    }
}
