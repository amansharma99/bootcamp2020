package com.spring.spring;
//Write a program to demonstrate Tightly Coupled code.
class upper
{
    String X;
    public String upper(String s)
    {
        X= s.toUpperCase();
        return X;
    }
}
class lower
{
    String Y;
    public String lower(String s)
    {
        Y=s.toLowerCase();
        return Y;
    }
}
public class Q1
{
    public static void main(String[] args) {
        lower low=new lower();
        upper up=new upper();
        String name="Aman Sharma";
        System.out.println("LowerCase"+low.lower(name));
        System.out.println("UpperCase"+up.upper(name));
    }
}