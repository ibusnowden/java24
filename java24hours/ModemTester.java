package java24hours.java24hours;

import java24hours.CableModem;
import java24hours.Commodores64Modem;
import java24hours.DslModem;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        Commodores64Modem put = new Commodores64Modem();

        surfBoard.speed = 500000;
        gateway.speed = 400000;
        put.speed = 300;
        System.out.println("Trying the cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect();
        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnect();
        System.out.println("trying the Commodores modem");
        put.displaySpeed();
        put.connect();
        put.disconnect();

    }
}
