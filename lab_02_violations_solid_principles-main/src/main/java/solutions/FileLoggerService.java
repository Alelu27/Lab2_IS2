package solutions;

public class FileLoggerService implements Logger {
    
    public void log(String message) {
        System.out.println("[FILE-LOGGER] " + message);
    }
}