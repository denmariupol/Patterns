import sun.rmi.runtime.Log;

public class Main {
    public static void main(String[] args) {
        Logger.getLogger().toString();

        Logger.getLogger().AddLog("First line...");
        Logger.getLogger().AddLog("Second line...");
        Logger.getLogger().AddLog("Third line...");
        System.out.println(Logger.getLogger().toString());
    }
}
