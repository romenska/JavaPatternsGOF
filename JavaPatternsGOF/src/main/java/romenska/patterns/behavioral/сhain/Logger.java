package romenska.patterns.behavioral.сhain;

public abstract class Logger {
    public static int LEVEL_ONE = 1;
    public static int LEVEL_TWO = 2;
    public static int LEVEL_THREE = 3;
    
    protected int level;

    protected Logger next;

    public Logger setNext(Logger log) {
        next = log;
        return log;
    }

    public void message(String msg, int priority) {
        if ( level <=priority) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}