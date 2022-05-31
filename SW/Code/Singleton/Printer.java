package singtleton;

// 싱글톤 객체 => 프린터기
public class Printer {

    private static Printer printer = null;

    // 생성자
    private Printer() {
        System.out.println("printer 최초 생성");
    }

    // 프린터기 가져오기
    public static Printer getPrinter() {

        if (printer == null) {
            printer = new Printer();
        }else {
            System.out.println("printer 이미 존재함");
        }
        return printer;
    }

    // 텍스트 프린트
    public void print(String msg) {
        System.out.println(msg);
    }
}
