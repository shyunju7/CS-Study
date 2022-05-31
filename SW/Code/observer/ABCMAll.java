package observer;


import java.util.ArrayList;
import java.util.List;

public class ABCMAll implements ShoppingMall {

    private List<Customer> customerList = new ArrayList<>();

    public void openShop() {
        System.out.println("***** ABC몰 영업 시작 *****");
        notifyCustomer("ABC몰에서 영업을 시작했습니다!");
    }

    public void addProduct() {
        System.out.println("***** 신상품 입고 *****");
        notifyCustomer("ABC몰에서 신상품이 입고되었습니다!");
    }

    public void saleProduct() {
        System.out.println("***** ABC몰 세일 시작 *****");
        notifyCustomer("ABC몰에서 세일을 시작했습니다!");
    }

    public void soldOutProduct() {
        System.out.println("***** ABC몰 상품 품절 *****");
        notifyCustomer("ABC몰 상품이 모두 풀절되었습니다!");
    }

    public void closeShop() {
        System.out.println("***** ABC몰 영업 종료 *****");
        notifyCustomer("ABC몰에서 영업을 종료했습니다!");
    }

    @Override
    public void subscribe(Customer customer) {
        customerList.add(customer);
        System.out.println(customer.getName() + "님이 구독을 시작하셨습니다.");
    }

    @Override
    public void unsubscribe(Customer customer) {
        customerList.remove(customer);
        System.out.println(customer.getName() + "님이 구독을 해제하셨습니다.");
    }

    @Override
    public void notifyCustomer(String msg) {
        customerList.forEach(customer -> customer.update("[ABC몰 수신] " + msg));
    }
}
