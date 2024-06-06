package com.company;

import java.util.ArrayList;

class Dog<E>{ // generic class
    E id;  // generic data type
    public Dog(E id){
        this.id = id;
    }
    E getId(){
       return id;
    }
}
class Cat<E,V>{
    E id;
    V name;

    public Cat(E id , V name){
        this.id = id;
        this.name = name;
    }
    public void setId( E id){
        this.id = id;
    }
    E getId(){
      return id;
    }
    public void setName(V name){
        this.name = name;
    }
    V getName(){
        return name;
    }
}
public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d = new Dog<>("jhasdh");  // dog with string data type
        Dog<String> d1 = new Dog<>("jhgsda");

        Dog<Integer> i1 = new Dog<>(12);
        System.out.println(i1.getId());

        Cat<Integer,String> obj = new Cat<>(121,"PinkCat");
      //  obj.setId(03);
        //obj.setName("Subhomoy");
        System.out.println(obj.getId());
        System.out.println(obj.getName());

       // ArrayList<Integer> l1 = new ArrayList<>(); generics also uses in arraylist
    }
}
