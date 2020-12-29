import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String [ ] args) {
        List<Vehicle> list = Vehicle.loadData();

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        Vehicle moreExpensive = Stadistic.moreExpensive(list);
        Vehicle cheaper = Stadistic.cheaper(list);
        Vehicle contains = Stadistic.contains("Y", list);

        System.out.println("=============================");

        System.out.println("Vehículo mas caro: " + moreExpensive.getBrand() + " " + moreExpensive.getModel());
        System.out.println("Vehículo mas barato: " + cheaper.getBrand() + " " + cheaper.getModel());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + contains.getBrand() + " " +
                contains.getModel() + " " + contains.getPriceFormat());

        System.out.println("=============================");

        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getBrand() + " " + list.get(i).getModel());
        }
    }
}
