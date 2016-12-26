package observer;

import flowers.delivery.IDelivery;
import flowers.order.Order;
import flowers.payment.IPayment;

import java.util.Observable;
import java.util.Observer;

/**
 * Observer. Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 */
public class CactusSapplierObserver implements Observer{
    Observable observable;
    private IDelivery deliveryWay;
    private IPayment paymentWay;
    public CactusSapplierObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof Order) {
            Order order = (Order) observable;
            this.deliveryWay = order.getDIelivery();
            System.out.println("Delivery way: " + this.deliveryWay + " " + "Payment way: " + this.paymentWay);
        }
    }
}
