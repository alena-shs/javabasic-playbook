package com.alenashomanova;

public class Main {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        System.out.println("a = "+a+"; b = "+b);

        //Arithmetic operators
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a / b = "+(a/b));
        System.out.println("b / a = "+(b/a));
        System.out.println("a % b = "+(a%b));
        System.out.println("a + b = "+(a+b));
        System.out.println("a++ = "+(a++));
        System.out.println("New a value = "+(a));
        System.out.println("++a = " + (++a));
        System.out.println("New a value = "+(a)+"\n");

        //Relational operators
        b=12;
        System.out.println("New b value = "+(b));
        System.out.println("a == b = "+(a == b));
        System.out.println("a != b = "+(a != b));
        System.out.println("a > b = "+(a > b));
        System.out.println("a < b = "+(a < b));
        System.out.println("b >= a = "+(b >= a));
        System.out.println("b <= a = "+(b <= a)+"\n");

        //Logical operators
        System.out.println("a>=b and a!=b? (this stament will be true if a>b) ..." + ((a>=b)&&(a!=b)));
        System.out.println("a>b, or maybe a>=b? (this stament will be true if !(a<b)) ..." + ((a>b)||(a>=b)));
        System.out.println("!(a != b) (so is it true that a=b?)..." + !(a != b)+"\n");

        System.out.println("Let's play with the limits of the byte type.");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte data type max value: "+maxByte);
        int one = 1;
        byte maxBytePlusOne = (byte) (one + maxByte);
        System.out.println("1 + byte max value = " + maxBytePlusOne);
        byte manual = (byte) (10 * 15);
        System.out.println("Trying to fit in 10*15 to the byte data type: "+manual+'\n');

        System.out.println("Let's play with int and double types");
        int i = 9;
        double d = 1.5;
        System.out.println("int i = "+i);
        System.out.println("double d = "+d);
        System.out.println("i + d = "+(i+d));
        System.out.println("i / d = "+(i/d));
        System.out.println("i * d = "+(i*d));


    }
}
