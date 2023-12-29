package com.company;
// runtime polymorphism
class A{
    int i ;
    public void display(){
        System.out.println(i);
    }
}
class B extends A{
    int j;
    public void display(){
        System.out.println(j);
    }
}
public class runtimePolymorphism {
    public static void main(String[] args) {
        B obj2 = new B();
        obj2.i = 1;
        obj2.j = 2;
        A ref; // Focus here
        ref = obj2;
        ref.display();
    }
}
