package flowers.order;

import flowers.item_with_decorators.Item;
import flowers.delivery.IDelivery;
import flowers.payment.IPayment;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by bohdan on 11/15/16.
 */
public class Order extends Observable {
    private List<Observer> observers = new LinkedList<>();
    private boolean changed = false;
    private List<Item> items = new LinkedList();
    private IPayment iPayment;
    private IDelivery iDelivery;

    public Order() {
        items = new LinkedList<>();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void setChanged() {
        changed = true;
    }
    public void notifyObservers(Object obj) {
        if (changed) {
            for(Observer observer: observers) {
                observer.update(this, new String(""));
            }
        }
    }
    public void changePaymentDelivery() {
        setChanged();
        notifyObservers();
    }
    void setPaymentStrategy(IPayment paymentMethod) {
        iPayment = paymentMethod;
        setChanged();
    }

    void setDeliveryStrategy(IDelivery deliveryMethon) {
        iDelivery = deliveryMethon;
        setChanged();
    }
    public IPayment getIPayment() {
        return iPayment;
    }
    public IDelivery getDIelivery() {
        return iDelivery;
    }
    double calculateToPrice() {
        double result = 0;
        for (Item item: items) {
            result += item.price();
        }
        return result;
    }

    boolean processOrder() {
        if (iPayment == null || iDelivery == null) {
            return false;
        }
        return true;
    }

    public void addItem(Item item ) {
        items.add(item);
        this.setChanged();
    }

    void removeItem(Item item) {
        items.remove(item);
        this.setChanged();
    }

}
