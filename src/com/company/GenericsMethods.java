package com.company;

public class GenericsMethods {
    static void printData(String data){ // this is the normal method we are trying to transform it into the generic method
        System.out.println(data);
    }
    static <E> void printData1(E data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        printData("Hello");
        printData1(12);
    }
}
