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

    static void method1(){
        throw new RuntimeException(new ArithmeticException());
    }
}

