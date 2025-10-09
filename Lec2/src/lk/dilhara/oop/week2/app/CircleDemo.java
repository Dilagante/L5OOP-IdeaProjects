package lk.dilhara.oop.week2.app;
import lk.dilhara.oop.week2.Circle;

import java.sql.SQLOutput;

public class CircleDemo {

    public static void main(String args[]) {

        System.out.println("No of Objects: " + Circle.getCounter());
        //To call a Static Method, Objects are not necessary
        //To call a Static Method, ClassName.methodName();
        //Ex: Circle.getCounter();

        //System.out.println("Area: " + Circle.getArea());
        //To call the Instance Method you need an object
        //Without creating an object you can never call an instance method

        Circle obj1 = new Circle(); //Calling the Default Constructor (No Args)

        System.out.println("Area of the First Object: " + obj1.getArea());


        System.out.println("No of Objects: " + Circle.getCounter());

        Circle obj2 = new Circle(3.45);

        System.out.println("Area of the Second Object: " + obj2.getArea());

        System.out.println("No of Objects: " + Circle.getCounter());

    }
}
