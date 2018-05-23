package com.company;

import java.util.Scanner;

class horse {
    public String name;
    public horse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
    }
}

class pegas extends horse {
    public pegas() {
        super();
    }

    public void fly() {
        System.out.println(name + " Полет");
    }
}

class pet {
    protected float weight;
    protected String name;
    protected String sex;
    public pet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка:\t");
        name=in.nextLine();
        System.out.print("Вес:\t");
        if(in.hasNextFloat()) weight=in.nextFloat();
        else System.out.println("Введены неверные значения");
        System.out.print("Пол:\t");
        in.nextLine();
        sex=in.nextLine();
    }
}

class dog extends pet{
    public dog(){
        super();
    }
    public void infodog(){
        System.out.println("Собака\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class cat extends pet{
    public cat(){
        super();
    }
    public void infocat(){
        System.out.println("Кошка\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class fish{
    protected int a;
    protected int b;
    public void life(){
        System.out.println("Хребет");
    }
}

class animal extends fish{
    protected int c;
    protected int d;
    public void arm(){
        System.out.println("Руки-ноги");
    }
}

class ape extends animal{
    protected int e;
    protected int f;
    public void Skill(){
        System.out.println("Умения");
    }
}

class human extends ape{
    protected int a;
    protected int b;
    public void mind(){
        System.out.println("Разум");
    }
}

public class Main {
    public static void main(String[] args) {
        pegas a = new pegas();
        a.fly();
        dog b = new dog();
        b.infodog();
        cat c = new cat();
        c.infocat();
        human d = new human();
        d.life();
        d.arm();
        d.Skill();
        d.mind();
    }
}
