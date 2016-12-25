package observer;

import flowers.delivery.IDelivery;
import flowers.order.Order;
import flowers.payment.IPayment;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by bohdan on 11/22/16.
 */
public class RomashkaSupplierObserver implements Observer{
    Observable observable;
    private IDelivery deliveryWay;
    private IPayment paymentWay;

    public RomashkaSupplierObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof Order) {
            Order order = (Order) obs;
            this.deliveryWay = order.getDIelivery();
            this.paymentWay = order.getIPayment();
            System.out.println("Delivery way: " + this.deliveryWay + " " + "Payment way: " + this.paymentWay);
        }
    }
}
