
public class Main {
    public static void main(String[] args) {
        
        Market market = new Market();
        
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Sveta");
        Human human3 = new Human("Vova");

        market.acceptToMarket(human1);
        market.update();

        market.acceptToMarket(human2);
        market.update();
    
        market.acceptToMarket(human3);
        market.update();
        System.out.println();

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();

    }
}
