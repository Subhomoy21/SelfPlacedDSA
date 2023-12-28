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
//To declare an interface, use the interface keyword. It is used to provide total abstraction.
// That means all the methods in the interface are declared with an empty body and are public,
// and all fields are public, static, and final by default. A class that implements an interface must
// implement all the methods declared in the interface. To implement interface use implements keyword.

//Why do we use interface?
//It is used to achieve total abstraction.
//Since java does not support multiple inheritance in the case of class, but by using interface it can achieve multiple inheritance.
//It is also used to achieve loose coupling.
//Interfaces are used to implement abstraction. So the question arises, Why use interfaces when we have abstract classes?
//The reason is that the abstract classes may contain non-final variables, whereas variables in interface are final, public, and static.