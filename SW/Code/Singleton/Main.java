package singtleton;

public class Main {

    public static void main(String[] args) {

        Client hj = new Client("현주");
        hj.use();

        Client yj = new Client("예지");
        yj.use();
      
        Client de = new Client("다은");
        de.use();
    }
}

/** 출력
 * printer 최초 생성
 * 현주님 사용중...
 * printer 이미 존재함
 * 예지님 사용중...
 * printer 이미 존재함
 * 다은님 사용중...
 * **/

