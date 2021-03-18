package com.company;

import java.util.Scanner;

public class Dialog
{

    public static double doDiag()
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        double number = myScan.nextDouble();
        return number;
    }
    public static void doView(double result, String typeOfResult)
    {
        System.out.printf("Du betaler %.2f%3s i %s%n",result,Main.CURRENCY,Main.MSG);
    }
}

