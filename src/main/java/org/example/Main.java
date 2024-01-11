package org.example;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();

        printer1.maker = "HP";
        printer1.prise = 300;
        printer2.maker = "Canon";
        printer2.prise = 500;
        printer3.maker = "Xerox";
        printer3.prise = 700;

        printer1.decreasePrise();
        printer3.decreasePrise();
        printer3.writePrinterInfo();

        System.out.println(printer2);

    }
}