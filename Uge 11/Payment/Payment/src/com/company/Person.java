package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Formatter;

public class Person {
    private String name;
    private String city;
    private String state;
    private String country;
    private Account account;

    Person(String name, String city, String state, String country){
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString(){
        return new Formatter().format("{%n Name: %s,%n City: %s,%n State: %s,%n Country: %s,%n Card number: %o,%n " +
                        "Payment type: %s,%n Account created: %s%n}",
                name, city, state, country, account.getCardNumber(), account.getPaymentType(), account.getAccountCreatedAsString()).toString();
    }

    public void createAccount(long cardNumber, String paymentType, String accountCreated){
        account = new Account(cardNumber, paymentType, accountCreated);
    }

}