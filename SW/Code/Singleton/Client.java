package singtleton;

// 
public class Client {

    // 사용자 이름
    public String name;

    // 사용자 생성
    public Client(String name) {
        this.name = name;
    }

    // 사용자가 프린터를 사용하기 위한 메서드
    public void use() {
        Printer printer = Printer.getPrinter();
        printer.print(name + "님 사용중...");
    }
}


