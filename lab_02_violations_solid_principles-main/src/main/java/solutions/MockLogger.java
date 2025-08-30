package solutions;

public class MockLogger implements Logger {
    
    public void log(String message) {
        System.out.println("[MOCK Logger] " + message);
    }
}
