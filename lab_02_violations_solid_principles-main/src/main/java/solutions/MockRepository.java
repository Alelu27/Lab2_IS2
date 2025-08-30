package solutions;

public class MockRepository implements OrderRepository {
    
    public void save(String order) {
        System.out.println("[MOCK Repository] Guardando orden: " + order);
    }
}
