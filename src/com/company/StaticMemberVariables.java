package com.company;

class Player{
    String name;
    int id;
    static int playerCount = 0;
    Player(String name){
        this.name = name;
        id = ++playerCount;
    }
    void printDetails(){
        System.out.println(id+":"+name);
    }
}
public class StaticMemberVariables {
    public static void main(String[] args) {
    Player p1 = new Player("Subhomoy");
    Player p2 = new Player("Rahul");
    p1.printDetails();
    p2.printDetails();
    }
}
