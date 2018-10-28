package application;

import devices.Printer;
import devices.Scanner;

public class Program {
    public static void main(String[] args){
        Printer p = new Printer("1080");
        p.processsDoc("My Letter");
        p.print("My Letter");

        Scanner s = new Scanner("2003");
        s.processsDoc("My email");
        System.out.println("Scan result: " + s.scan());
    }
}
