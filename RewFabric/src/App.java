import Classes.itemGenerator;
import Rewards.GemFabric;
import Rewards.GoldFabric;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        itemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        itemGenerator fab2 = new GemFabric();
        fab2.openReward();
//        System.out.println("Hello, World!");

        Random rnd = ThreadLocalRandom.current();
        List<itemGenerator> fabriclist = new ArrayList<>();
        fabriclist.add(fab1);
        fabriclist.add(fab2);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1);
            fabriclist.get(index).openReward(); 
        }
    }
}
