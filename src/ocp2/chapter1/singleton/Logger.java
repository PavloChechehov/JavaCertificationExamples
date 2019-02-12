package ocp2.chapter1.singleton;

public class Logger {

    private Logger() {
    }

    public static class LoggerHolder {
        public static Logger logger = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.logger;
    }

    public void log(String s) {
        System.err.println(s);
    }

    public static void main(String[] args) {

        Logger instance = getInstance();
        System.out.println("instance = " + instance);

        Logger logger = LoggerHolder.logger;
        System.out.println("logger = " + logger);
    }
}
