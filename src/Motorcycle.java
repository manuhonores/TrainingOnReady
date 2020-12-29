import java.text.NumberFormat;

public class Motorcycle extends Vehicle {
    //Cilindrada
    private String cc;

    public Motorcycle() {
    }

    public Motorcycle(String brand, String model, double price, String cc) {
        super(brand, model, price);
        this.cc = cc;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return "Marca: " + this.getBrand() + " // " + "Modelo: " + this.getModel() + " // " + "Cilindrada: " + this.getCc() + " // " +
                "Precio: " + currencyFormat.format(this.getPrice());
    }
}
