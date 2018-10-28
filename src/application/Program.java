package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
    public static void main(String[] args){
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processsDoc("My Letter");
        p.print("My Letter");
        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processsDoc("My email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processsDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + s.scan());
    }
}
