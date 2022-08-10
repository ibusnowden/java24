package java24hours;

public class DslModem extends Modem {
    String method = "DSL phone connection";
    String name = "in DSL";
    public void connect() {
        System.out.println("Connecting to the internet ...");
        System.out.println("Using a " + method);
    }

    public void disconnect() {
        System.out.println("When it should go deciding to support disconnection " + name);

    }
}
