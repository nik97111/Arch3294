import Classes.itemGenerator;
import Rewards.BronzeFabric;
import Rewards.CrystalFabric;
import Rewards.GemFabric;
import Rewards.GoldFabric;
import Rewards.PlatinumFabric;
import Rewards.SilverFabric;
import Rewards.VelvetFabric;
import Rewards.SilkFabric;
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
        itemGenerator fab3 = new BronzeFabric();
        fab3.openReward();
        itemGenerator fab4 = new SilverFabric();
        fab4.openReward();
        itemGenerator fab5 = new PlatinumFabric();
        fab5.openReward();
        itemGenerator fab6 = new CrystalFabric();
        fab6.openReward();
        itemGenerator fab7 = new VelvetFabric();
        fab7.openReward();
        itemGenerator fab8 = new SilkFabric();
        fab8.openReward();
//        System.out.println("Hello, World!");

        Random rnd = ThreadLocalRandom.current();
        List<itemGenerator> fabriclist = new ArrayList<>();
        fabriclist.add(fab1);
        fabriclist.add(fab2);
        fabriclist.add(fab3);
        fabriclist.add(fab4);
        fabriclist.add(fab5);
        fabriclist.add(fab6);
        fabriclist.add(fab7);
        fabriclist.add(fab8);

        for (int i = 0; i < 10; i++) {
//            int index = Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1);
            int index = (int) (Math.random() * 8);
            fabriclist.get(index).openReward(); 
        }
    }
}
