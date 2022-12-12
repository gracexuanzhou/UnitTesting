package org.example;

public class Calculator {
    public static double multiple(double i,double j){
        return i*j;
    }
    public static double divide(double i, double j){
        if (i==0)
            throw new RuntimeException("The division number couldn't be zero");
        else
            return i / j;
    }
    public static double sum(double i, double j){
        return i+j;
    }
    public static double subtract(double i, double j){
        return i-j;
    }
}
