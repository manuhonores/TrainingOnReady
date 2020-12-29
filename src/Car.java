import java.text.NumberFormat;

public class Car extends Vehicle {
    private int door;

    public Car() {
    }

    public Car(String brand, String model, double price, int door) {
        super(brand, model, price);
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }


    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return "Marca: " + this.getBrand() + " // " + "Modelo: " + this.getModel() + " // " + "Puertas: " + this.getDoor() + " // " +
                "Precio: " + currencyFormat.format(this.getPrice());
    }
}
