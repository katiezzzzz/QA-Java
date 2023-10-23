package com.qa;

public class Car {

//    CONSTRUCTOR
//    parameterless constructor
    public Car() {
        this("Ford", "Focus", COLOUR.Black);
    }
//    OVERLOADING - methods, writing something modifying them
    public Car(String make, String model) {
//        constructor chaining
        this(make, model, COLOUR.Black);
    }
    public Car(String make, String model, COLOUR colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }



//    by default a subclass of java.lang.object
//    what is this class for?
//    how will it be used?
//    DESIGN
//    create a good abstraction of a car
//    DATA
//    fields aka instance variables
    private String make;
    private String model;
    private COLOUR colour;
    private int age;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

//    getters and setters - special methods that allow reading and writing of private fields
    public String getMake() {
//        e.g. can be used to convert units
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public COLOUR getColour() {
        return this.colour;
    }

    public void setColour(COLOUR colour) {
        this.colour = colour;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 70) {
            this.age = age;
        }
//        can throw an exception, but it can be expensive
//        needs to validate in setter
    }

//    not necessary but a safety net - telling java that you are writing over a known entity
//    @override is just to make sure there is something with the exact signature that you're overriding
//    if not matching, give error upon compile
    @Override
    public String toString() {
//        return "Car make: " + this.make + " Car model: " + this.model + " Age: " + this.age + " Colour: " + this.colour;
//        if you're going to concatenate lots of strings together - use a string builder
//        String.format()
        String output = String.format("This car is a %s %s and is %d years old and is %s in colour", this.make, this.model, this.age, this.colour);
        return output;
    }

//    BEHAVIOURAL METHODS
    public String start() {
        return String.format("The %s car has started", this.getColour());
    }

//    overload the start method by changing signatures
    public String start(String means) {
        return String.format("The %s car has started using a %s", this.getColour(), means);
    }

    public String stop(){
        return String.format("The %s car has stopped", this.getColour());
    }
}
