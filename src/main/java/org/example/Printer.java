package org.example;

public class Printer {
    String maker;
    int prise;
    void myMethod(){
        System.out.println("this is method");
    }
    void writePrinterInfo(){
        System.out.println("Im printer");
        System.out.println("My maker is " + this.maker);
        System.out.println("My prise is " + this.prise);
    }
    void decreasePrise(){
        this.prise = this.prise - 10;
    }
}
