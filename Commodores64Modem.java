package java24hours;

public class Commodores64Modem extends Modem {
   String method =  "Commodores connection";
    String name = "in Commodore 64";

    public void connect() {
        System.out.println("Connecting to the internet ...");
        System.out.println("Using a " + method);

    }

    public void disconnect() {
        System.out.println("When it should go deciding to support disconnection " + name);
    }
}
