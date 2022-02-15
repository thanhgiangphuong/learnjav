package TinhDaHinh;

public class AmexCard implements PaymentGateway{
    @Override
    public void payment() {
        System.out.println("Payment by Amex Card");
    }
}
