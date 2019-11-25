import java.util.*;

public class Garage {

   private Map<Car, Integer> garage = new HashMap<>();


    public  void parking( Car car, int a) {
        if (!garage.containsKey(car)) {
            garage.put(car, a);
        }
        else {
            garage.replace(car, garage.get(car) + a);
        }
        System.out.println(a + " " + car.getModel() + " " + car.getMark() + " parked");
    }

    public  void checkOut(Car car, int a) {
        if(garage.containsKey(car)){
            garage.replace(car, garage.get(car) - a);
            System.out.println(a + " " + car.getModel() + " " + car.getMark() + " set out");
        }
        else{
            garage.replace(car,0);
        }
    }

    public  void amount( String car) {
        int amountCarInGarage = 0;
        for(Map.Entry<Car, Integer> item : garage.entrySet()) {
            if (item.getKey().getModel().equals(car)) {
                amountCarInGarage += item.getValue();
            }
        }
        System.out.println("in garage " + amountCarInGarage + " " + car);
    }

}
