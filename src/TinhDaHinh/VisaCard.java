package TinhDaHinh;

public class VisaCard implements PaymentGateway {
    @Override
    public void payment() {
        System.out.println("Payment by Visa Card");
    }
}
