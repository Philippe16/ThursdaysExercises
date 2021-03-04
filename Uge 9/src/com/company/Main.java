package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //For task 2.---------------------------------------
    private static String[][] text2 = new String[12][1];


    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        Scanner scan2 = new Scanner(file);
        String longestSentence = "";
        int i = 0;

        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");
            //System.out.println(text[i].length);

            i++;
        }
        //For task 2.-----------------------------------------------------------------------------------
        int j = 0;
        while (scan2.hasNextLine()) {
            text2[j] = scan2.nextLine().split("\\.");
            for (int k = 0; k < text2.length;k++) {
                if(k < text2[j].length){
                    if(longestSentence.length() < text2[j][k].length()){

                }

                    longestSentence = text2[j][k];
                }

            }
        }
        System.out.println(longestSentence);
        //---------------------------------------------------------------------------------------------------



        //printWordsStartingWith("Ø");
        //printWordsOfLength(3);


        //For task 3.
        printPartOfWord("København", 0, 12);

        //For task 1.
        printWordsWithDoubleConsonant(16);
        printWordsWithDoubleConsonant(13);
        printWordsWithDoubleConsonant(11);
        printWordsWithDoubleConsonant(10);
        printWordsWithDoubleConsonant(9);
        printWordsWithDoubleConsonant(8);
        printWordsWithDoubleConsonant(7);
        printWordsWithDoubleConsonant(6);
        printWordsWithDoubleConsonant(5);
        printIfPalindrome("Den laks skal ned");
    }


    //For task 1.---------------------------------------------------------------------------------------
    public static void printWordsWithDoubleConsonant(int Cons) {
        boolean wordIsConsonant = true;
        for (int i = 0; i < text.length; i++) {
            for (String j : text[i]) {
                if (j.length() == Cons) {
                    if (j.contains("bb") || (j.contains("cc") || (j.contains("dd") || (j.contains("ff") || (j.contains("gg")|| (j.contains("hh")||(j.contains("jj") || (j.contains("kk") || (j.contains("ll") || (j.contains("mm") || (j.contains("nn")||(j.contains("pp") || (j.contains("rr") || (j.contains("ss") || (j.contains("tt") ))))))))))))))) {
                        wordIsConsonant = true;
                        System.out.println(j);
                    }

                    if (!wordIsConsonant) {
                    }

                }
            }

        }


    }
    //For Task 3.------------------------------------------------------------------------------
    private static void printPartOfWord(String word, int index, int length) {

        try {
            System.out.println("Word: " + word);
            PrintStream tooHigh = System.out;
            String tooHigh1 = word.substring(index, length);
           tooHigh.println(" " + tooHigh1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid parameters");
        }

    }
    //----------------------------------------------------------------


    //For Task 4. ------------------------------------------------------------------------------------
    private static void printIfPalindrome(String input) {
        String Input = input.toLowerCase();
        String InputInReverse = new StringBuilder(Input).reverse().toString();

        if(Input.equals(InputInReverse)){
            System.out.println(InputInReverse);
        }
    }



    private static void printWordsOfLength(int wordLength) {
        boolean wordIsValid = true;

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == wordLength) {

                    if (s.contains(",") || s.contains(".")) {
                        wordIsValid = false;
                    }

                    if (wordIsValid == true) {
                        System.out.println(s);
                    }
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }
        }
    }





    }



