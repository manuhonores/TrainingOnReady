import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Comparable<Vehicle> {
    private String brand;
    private String model;
    private double price;

    public Vehicle() {

    }

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormat() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Vehicle> loadData() {
        List<Vehicle> lista = new ArrayList<Vehicle>();

        Vehicle car1 = new Car("Peugeot", "206", 200000, 4);
        Vehicle car2 = new Car("Peugeot", "208", 250000, 5);
        Vehicle motorcycle1 = new Motorcycle("Honda", "Titan", 60000, "125cc");
        Vehicle motorcycle2 = new Motorcycle("Yamaha", "YBR", 80500.50, "160cc");

        lista.add(car1);
        lista.add(motorcycle1);
        lista.add(car2);
        lista.add(motorcycle2);

        return lista;
    }

    public int compareTo(Vehicle vehicle) {
        if(this.getPrice() == vehicle.getPrice()) {
            return 0;
        } else if(this.getPrice() > vehicle.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }

}
