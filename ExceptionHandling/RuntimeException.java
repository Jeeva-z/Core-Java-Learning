package org.java;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (RuntimeException e){
            System.out.println(e.getCause());
        }
    }

    //throws keyword becomes optional here as it is an unchecked exception
    static void method1() { // throws RuntimeException(){
        throw new RuntimeException(new ArithmeticException());
    }
}

