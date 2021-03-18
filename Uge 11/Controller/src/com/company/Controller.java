package com.company;

public class Controller
{
    public static void runController() {
        double userIn = Dialog.doDiag();
        double moms = VAT.doVAT(userIn);
        Dialog.doView(moms,Main.MSG);
    }
}