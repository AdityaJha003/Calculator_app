package org.ncu.Calculator;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter the operation you want to perform: ");
        String s = sc.next();
        System.out.println("Enter integer 1: ");
        int a = sc.nextInt();
        System.out.println("Enter integer 2: ");
        int b = sc.nextInt();
        MathService ms = c.compute(s, a, b);
        ms.operate(a, b);
    }
}
