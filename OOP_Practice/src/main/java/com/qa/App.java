package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

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
}
