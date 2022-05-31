package adpater;

// 어댑터
public class USAAdapter extends USA implements Greet {

    @Override
    public void greet() {
        hello();
    }
}
