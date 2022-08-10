package java24hours;

public class CableModem extends Modem {
    String method = "cable connection";
    String name = "in cable";

    public void connect() {
        System.out.println("Connecting to the internet  ...");
        System.out.println("Using a " + method);
    }

    public void disconnect() {

        System.out.println("When it should go deciding to support disconnection " + name);

    }
}
