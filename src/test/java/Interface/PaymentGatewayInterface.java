package Interface;

public class PaymentGatewayInterface implements UPIInterface,Cards,Paypal {


    @Override
    public void merchant() {
        System.out.println("paypal");
    }

    @Override
    public void visa() {
        System.out.println("visa");
    }

    @Override
    public void masterCard() {
        System.out.println("mastercard");
    }

    @Override
    public void phonepay() {
        System.out.println("phonepay");
    }

    @Override
    public void googlePay() {
        System.out.println("googlepay");
    }

    public static void main(String[] args) {
        PaymentGatewayInterface i1=new PaymentGatewayInterface();
        i1.googlePay();
        i1.merchant();
        i1.visa();
        i1.masterCard();
        i1.phonepay();
    }
}
