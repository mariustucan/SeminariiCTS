package S8.decorator.main;

import S8.decorator.clase.BasicSubscription;
import S8.decorator.clase.HDStreamingDecorator;
import S8.decorator.clase.OfflineViewingDecorator;
import S8.decorator.clase.Subscription;

public class Main {
    public static void main(String[] args) {
        Subscription subscription = new BasicSubscription();

        subscription = new OfflineViewingDecorator(subscription);

        subscription = new HDStreamingDecorator(subscription);

        System.out.println("Descriere:" + subscription.getDescription());
        System.out.println("Pret:" + subscription.getPrice());
    }

}
