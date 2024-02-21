import java.util.ArrayList;
import java.util.List;

import domen.Bottle;
import domen.HotDrink;
import domen.Prodyct;
import servises.CoinDespenser;
import servises.Display;
import servises.Holder;
import servises.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Prodyct prodyct1 = new Prodyct(1, "chips Lais", 123.5, 4);
        Prodyct prodyct2 = new Prodyct(2, "chokolate", 80.2, 7);
        Prodyct prodyct3 = new Prodyct(3, "oreo", 150.5, 1);
        Prodyct prodyct4 = new Prodyct(4, "cnikers", 54.5, 7);
        Bottle bottle = new Bottle(5, "Cola", 90.3, 16, 0.5);
        HotDrink drink = new HotDrink(6, "coffee", 50.5, 22, 70);

        List<Prodyct> ourList = new ArrayList<>();
        ourList.add(prodyct1);
        ourList.add(prodyct2);
        ourList.add(prodyct3);
        ourList.add(prodyct4);
        ourList.add(bottle);
        ourList.add(drink);

        Holder holder = new Holder();
        Display display = new Display();
        CoinDespenser despenser = new CoinDespenser();

        VendingMachine machine = new VendingMachine(holder, display, despenser, ourList);
        for (Prodyct item : machine.getProdycts()) {
            System.out.println("item = " + item);
        }
    }
}
