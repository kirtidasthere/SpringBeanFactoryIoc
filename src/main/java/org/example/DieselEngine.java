package org.example;

public class DieselEngine implements Engine{

    DieselEngine()
    {
        System.out.println("Diesel Engine Constructor...");
    }
    public int start() {
        System.out.println("Diesel Engine start...");
        return 1;
    }
}
