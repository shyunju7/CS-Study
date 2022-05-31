package observer;

public class Main {

    public static void main(String[] args) {

        // 마켓 생성
        ABCMAll abcMall = new ABCMAll();

        // 고객 생성
        Customer hj = new HJ("현주");
        Customer de = new DE("다은");
        Customer yj = new YJ("예지");

        // 마켓 구독
        abcMall.subscribe(hj);
        abcMall.subscribe(de);
        abcMall.subscribe(yj);

        // 마켓 오픈 알림
        abcMall.openShop();

        // 마켓 세일 알림
        abcMall.saleProduct();

        // 마켓 구독 해제
        abcMall.unsubscribe(yj);

        // 마켓 신상 알림
        abcMall.addProduct();

        // 마켓 매진 알림
        abcMall.soldOutProduct();

        // 마켓 영업 종료 알림
        abcMall.closeShop();
    }
}

/** 출력
 * 현주님이 구독을 시작하셨습니다.
 * 다은님이 구독을 시작하셨습니다.
 * 예지님이 구독을 시작하셨습니다.
 * ***** ABC몰 영업 시작 *****
 * [ABC몰 수신] ABC몰에서 영업을 시작했습니다!
 * [ABC몰 수신] ABC몰에서 영업을 시작했습니다!
 * [ABC몰 수신] ABC몰에서 영업을 시작했습니다!
 * ***** ABC몰 세일 시작 *****
 * [ABC몰 수신] ABC몰에서 세일을 시작했습니다!
 * [ABC몰 수신] ABC몰에서 세일을 시작했습니다!
 * [ABC몰 수신] ABC몰에서 세일을 시작했습니다!
 * 예지님이 구독을 해제하셨습니다.
 * ***** 신상품 입고 *****
 * [ABC몰 수신] ABC몰에서 신상품이 입고되었습니다!
 * [ABC몰 수신] ABC몰에서 신상품이 입고되었습니다!
 * ***** ABC몰 상품 품절 *****
 * [ABC몰 수신] ABC몰 상품이 모두 풀절되었습니다!
 * [ABC몰 수신] ABC몰 상품이 모두 풀절되었습니다!
 * ***** ABC몰 영업 종료 *****
 * [ABC몰 수신] ABC몰에서 영업을 종료했습니다!
 * [ABC몰 수신] ABC몰에서 영업을 종료했습니다!
 * **/