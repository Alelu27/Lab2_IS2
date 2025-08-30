package solutions;

public class FileLoggerService implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[FILE-LOGGER] " + message);
    }
}