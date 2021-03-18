package com.company;

public class Main{
    public static void main(String[] args){
        Person person1 = new Person("Gouya", "Echuca", "Victoria", "Australia");
        Person person2 = new Person("Janet", "Ottawa", "Ontario", "Canada");
        Person person3 = new Person("James", "Burpengary", "Queensland", "Australia");
        Person person4 = new Person("Mehmet Fatih", "Helsingor", "Frederiksborg", "Denmark");

        person1.createAccount(4593781145107322L, "Visa", "9/25/05 21:13");
        person2.createAccount(4234120954489197L, "Visa", "1/5/09 9:35");
        person3.createAccount(4904344348439820L, "Visa", "12/10/08 19:53");
        person4.createAccount(4737470823565213L, "Visa", "1/3/09 12:47");

        System.out.println(person1);
        person4.getAccount().validateCardNumber();
    }

}