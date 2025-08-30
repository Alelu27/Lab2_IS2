package solutions;

public class MockLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[MOCK Logger] " + message);
    }
}
