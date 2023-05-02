package be.intecbrussel.log;

import java.util.Arrays;

public class Log {
    private StackTraceElement[] stackTraceElement;
    private String message;
    private Level logLevel;

    public Log(StackTraceElement[] stackTraceElement, String message, Level logLevel) {
        this.stackTraceElement = stackTraceElement;
        this.message = message;
        this.logLevel = logLevel;
    }

    public StackTraceElement[] getStackTraceElement() {
        return stackTraceElement;
    }

    public void setStackTraceElement(StackTraceElement[] stackTraceElement) {
        this.stackTraceElement = stackTraceElement;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Level getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public String toString() {
        return "Log{" +
                "stackTraceElement=" + Arrays.toString(stackTraceElement) +
                ", message='" + message + '\'' +
                ", logLevel=" + logLevel +
                '}';
    }
}
