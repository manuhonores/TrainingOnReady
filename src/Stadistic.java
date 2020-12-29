import java.util.List;

public class Stadistic {


    public Stadistic() {
    }

    /**
     * Este metodo obtiene el vehiculo mas caro de la lista
     * @param list El parametro list, es la lista de vehiculos.
     * @return el vehiculo mas caro de la lista
     */
    public static Vehicle moreExpensive(List<Vehicle> list) {
        Vehicle vehicle = null;
        double max = -1;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
                vehicle = list.get(i);
            }
        }
        return vehicle;
    }

    /**
     * Este metodo obtiene el vehiculo mas barato de la lista
     * @param list El parametro list, es la lista de vehiculos.
     * @return el vehiculo mas barato de la lista
     */
    public static Vehicle cheaper(List<Vehicle> list) {
        Vehicle vehicle = null;
        double min = 999999999;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getPrice() < min) {
                min = list.get(i).getPrice();
                vehicle = list.get(i);
            }
        }
        return vehicle;
    }

    /**
     * Este metodo obtiene el ultimo vehiculo que contenga la letra enviada por parametro
     * @param letter El parametro letter, hace referencia a la letra que se envía como parametro
     * @param list El parametro list, es la lista de vehiculos.
     * @return el vehiculo de la lista, que contiene la letra que se pasa por parametro
     */
    public static Vehicle contains(String letter, List<Vehicle> list) {
        Vehicle vehicle = null;
        for(int i=0; i<list.size(); i++) {
            String name = list.get(i).getModel().toUpperCase();
            if(name.contains(letter)) {
                vehicle = list.get(i);
            }
        }
        return vehicle;
    }
}
