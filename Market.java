import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBahaviour {

    List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println("Покупатель " + actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " в очереди");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder = true) {
                actor.setMakeOrder(true);
                System.out.println("Покупатель " + actor.getName() + " сделал заказ");
            }
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println("Покупатель " + actor.getName() + " забрал заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println("Покупатель " + actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }

}