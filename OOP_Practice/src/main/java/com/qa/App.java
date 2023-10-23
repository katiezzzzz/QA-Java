package com.qa;

/**
 * OOP Practice
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        object instantiation
        Car sheilasCar;
        sheilasCar = new Car();
        String makeOfSheilasCar = sheilasCar.getMake();
        System.out.println("The make of Sheila's car is: " + makeOfSheilasCar);
        System.out.println("The model of Sheila's car is: " + sheilasCar.getModel());
        sheilasCar.setColour(COLOUR.White);
        System.out.println("Sheila's car is " + sheilasCar.getColour());

        Car gracesCar = new Car();
        System.out.println("Grace: " + gracesCar.getMake() + " " + gracesCar.getModel());
        gracesCar.setColour(COLOUR.Blue);
        System.out.println("Grace's car is " + gracesCar.getColour());

        sheilasCar.setAge(2);
        gracesCar.setAge(96);
        System.out.println("Sheila's car is " + sheilasCar.getAge() + " years old");
        System.out.println("Grace's car is " + gracesCar.getAge() + " years old");

        System.out.println(sheilasCar.toString());
        System.out.println(gracesCar.toString());
//        sout only prints string so toString is automatically called
        System.out.println(gracesCar);
//        sheilasCar = null;

        System.out.println(sheilasCar.stop());
//        method overloading
        System.out.println(gracesCar.start());
        System.out.println(gracesCar.start("Retina scan"));

        Car evelynsCar = new Car("Mini", "Cooper", COLOUR.Red);
        System.out.println(evelynsCar);
        Car billsCar = new Car("Austin", "Allegro");
        System.out.println(billsCar);
    }

    public static void carExample() {
//        object instantiation
        Car lisaCar = new Car();
//        variable does not have the object, but instead is a pointer to where the class is
//        object on the managed heap, variables on the stack
        String lisa = lisaCar.toString();
        System.out.println(lisa);

        Car bartCar = new Car();
        System.out.println(bartCar.toString());

        boolean isSame = bartCar.equals(lisaCar);
        System.out.println(isSame);
    }

    public static void stringFormat() {
        String greeting = "Hello World";

        int x = 5, y = 12;
        String result = String.format("X: %d and Y: %d are the same: %b", x, y, x==y);
        System.out.println(result);
    }
}
