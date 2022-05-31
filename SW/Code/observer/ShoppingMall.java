package observer;

// 판매 마켓
public interface ShoppingMall {

    public void subscribe(Customer customer);

    public void unsubscribe(Customer customer);

    public void notifyCustomer(String msg);

}
