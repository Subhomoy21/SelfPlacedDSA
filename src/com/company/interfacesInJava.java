package com.company;

interface Printable{
    void print();
}
class MyClass implements Printable{
    public void print(){
        System.out.println("MyClass");
    }
}
public class interfacesInJava {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.print();
    }
}
