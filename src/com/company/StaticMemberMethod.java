package com.company;

class Player1
{
    String name;
    int id;

    private static int playerCount = 0;

    Player1(String name)
    {
        this.name = name;
        id= ++playerCount;
    }

    static int getplayerCount()
    {
        return playerCount;
    }
}
public class StaticMemberMethod {
    public static void main(String[] args) {
        System.out.println(Player1.getplayerCount());

        Player1 p1 = new Player1("abc");

        System.out.println(Player1.getplayerCount());
    }
}
