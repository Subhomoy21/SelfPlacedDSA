package com.company;

public class Encapsulation {
   private String geekName;

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    private int geekRoll;

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }

    private int geekAge;


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setGeekName("Subhomoy");
        obj.setGeekAge(21);
        obj.setGeekRoll(8);
        System.out.println("The name of the dumb geek is:" + obj.getGeekName());
        System.out.println("The age of the dumb geek is:" + obj.getGeekAge() );
        System.out.println( "And the roll number of the geek is :" + obj.getGeekRoll());
    }
}
