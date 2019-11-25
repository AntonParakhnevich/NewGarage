import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Bmw("BMW", "X5", 2010, "black",2);
        Car bmw1 = new Bmw("BMW", "X3", 1993, "White",3);
        Car kia = new Kia("Kia", "Rio", 2013, "red",5);
        Garage garage = new Garage();
//        garage.garage.put(bmw, 3);
//        garage.garage.put(bmw1,1);
//        garage.garage.put(kia,2);
        garage.parking( bmw1, 3);
        garage.checkOut( bmw1, 2);
        garage.amount("BMW");
        System.out.println(bmw1);

    }
}
