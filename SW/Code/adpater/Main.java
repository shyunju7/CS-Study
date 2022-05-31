package adpater;

// Client
public class Main {

    public static void main(String[] args){

        // USA 어댑터 생성 및 실행
        Greet usaAdapter = new USAAdapter();
        usaAdapter.greet();

        // China 어댑터 생성 및 실행
        Greet chinaAdapter = new ChinaAdapter();
        chinaAdapter.greet();
    }
}
