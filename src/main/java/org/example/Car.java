package org.example;

public class Car {

    Engine engine;

    Car()
    {
        System.out.println("Car constructor...");
    }
    public Car(Engine engine) {
        System.out.println("car | 1 argument constructor...");
        this.engine = engine;
    }



    public void setEngine(Engine engine) {
        System.out.println("Car setter method...");
        this.engine = engine;
    }

    public void drive()
    {
        int res=engine.start();
        if(res>=1)
        {
            System.out.println("Car started...");
        }
        else
        {
            System.out.println("Engine not Started...");
        }
    }
}
