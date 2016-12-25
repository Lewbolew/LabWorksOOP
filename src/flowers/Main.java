package flowers;

import flowers.delivery.DHLDeliveryStrategy;
import flowers.delivery.IDelivery;
import flowers.delivery.PostDeliveryStrategy;
import flowers.enums.FlowerColor;
import flowers.order.Order;
import flowers.payment.CreditCartPaymentStrategy;
import flowers.payment.IPayment;
import flowers.payment.PayPaLPaymentStrategy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower(new FlowerSpec(1223, 122, true, "Romaska", FlowerColor.WHITE));
        Flower f5 = new Flower(new FlowerSpec(122133, 1232, true, "Romaska", FlowerColor.WHITE));
        Flower f6 = new Flower(new FlowerSpec(123, 12, true, "Romaska", FlowerColor.WHITE));
        Flower f2 = new Flower(new FlowerSpec(40, 20, false, "Malvina", FlowerColor.BLUE));
        Flower f3 = new Flower(new FlowerSpec(21, 10, true, "Pyvonia", FlowerColor.RED));

        List<Flower> arr1 = new ArrayList<>(Arrays.asList(f1, f2));
        List<Flower> arr2 = new ArrayList<>(Arrays.asList(f2, f3));
        List<Flower> arr3 = new ArrayList<>(Arrays.asList(f1, f2, f3, f5, f6));
        List<Flower> arr4 = new ArrayList<>(Arrays.asList(f1,f3));

        Bouquet b1 = new Bouquet("Blue eye", arr1);
        Bouquet b2 = new Bouquet("Milk sky",arr2);
        Bouquet b3 = new Bouquet("Red pleasure", arr3);
        Bouquet b4 = new Bouquet("Gold ", arr4);

        System.out.println("Sorting by freshness");
        b1.sortByFreshness();
        b2.sortByFreshness();
        b3.sortByFreshness();
        b4.sortByFreshness();
        System.out.println();

        System.out.println("The price of the bouqet4: " + b4.price);
        System.out.println("The size of the bouqet4: " + b4.size);
        System.out.println("The freshness of the bouqet4: " + b4.fresh);
        System.out.println();
        System.out.println("Finding the flower in the bouqet1 from 12 cm to 15 cm dimensions of the stem: ");

        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addBouquet(b1);
        flowerShop.addBouquet(b2);
        flowerShop.addBouquet(b3);
        flowerShop.addBouquet(b4);
        System.out.println();


        Order order = new Order();
        order.addItem(b1);
        order.addItem(b2);
        order.addItem(b3);
        order.addItem(b4);
        System.out.println("Welcome to our beautiful shop!");
        Scanner scanner = new Scanner(System.in);
        IPayment iPayment = null;
        while (true) {
            System.out.println("Choose delivery method(C - credit card,P - pay pal): ");
            String str = scanner.nextLine();
            if ( str.toUpperCase().equals("P")) {
                iPayment = new CreditCartPaymentStrategy();
                break;
            } else if (str.toUpperCase().equals("C")) {
                iPayment = new PayPaLPaymentStrategy();
                break;
            }
            else {
                System.out.println("You entered wrong answer, try again!");
            }
        }

        System.out.println("Choose delivery method(D - DHLD, P - post)");
        IDelivery iDelivery = null;
        String str = scanner.nextLine();
        if (str.toUpperCase().equals("D")) {
            iDelivery = new DHLDeliveryStrategy();
        } else if (str.equals("P")) {
            iDelivery = new PostDeliveryStrategy();
        }
        System.out.println("Our assortment: ");


    }




}
