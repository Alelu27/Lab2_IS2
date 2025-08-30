package solutions;

public class DatabaseOrderRepository implements OrderRepository {

    public void save(String order) {
        System.out.println("Guardando orden en la base de datos: " + order);
    }
}
