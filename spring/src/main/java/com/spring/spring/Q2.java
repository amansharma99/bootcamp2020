package com.spring.spring;

import java.util.Scanner;
//(2) Write a program to demonstrate Loosely Coupled code.
interface charchange
{
    public String change(String name);
}
class low implements charchange
{
    String X;
    @Override
    public String change(String name)
    {
        X=name.toLowerCase();
        return X;
    }
}
class up implements charchange
{
    String Y;
    @Override
    public String change(String name)
    {
        Y=name.toUpperCase();
        return Y;
    }
}
public class Q2
{
    public static void main(String[] args) {
        String name="AmanSharma";
        System.out.println("String: "+name);
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for upper case");
        System.out.println("2 for lower case");
        int i=sc.nextInt();
        switch (i)
        {
            case 1:
                charchange ch=new up();
                String s=ch.change(name);
                System.out.println("Upper: "+s);
                break;
            case 2:
                charchange ch1=new low();
                String s1=ch1.change(name);
                System.out.println("Lower: "+s1);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}