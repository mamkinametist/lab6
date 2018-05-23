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
        System.out.print("Собака\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class cat extends pet{
    public cat(){
        super();
    }
    public void infocat(){
        System.out.print("Кошка\nКличка:\t"+name+"\nВес:\t"+Float.toString(weight)+"\nПол:\t"+sex);
    }
}

class fish{
    protected int a;
    protected int b;

}

class animal extends fish{
    protected int c;
    protected int d;
    //тут должен быть код
}

class ape extends animal{
    protected int e;
    protected int f;
//тут должен быть код
}

class human extends ape{
    protected int a;
    protected int b;
//тут должен быть код
}

public class Main {
    public static void main(String[] args) {
        pegas a = new pegas();
        a.fly();
        dog b = new dog();
        b.infodog();
        cat c = new cat();
        c.infocat();
    }
}
