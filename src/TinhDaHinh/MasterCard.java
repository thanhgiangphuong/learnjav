package TinhDaHinh;

public class MasterCard implements PaymentGateway{
    @Override
    public void payment() {
        System.out.println("Payment by Master Card");
    }
}
