package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal cat = new Animal(5, 0.5, "Cat");
        System.out.println(cat);

        Animal ant = new Animal();
        ant.setAge(1);
        System.out.println(ant);
    }
}
