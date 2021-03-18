package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Account {
    static DateTimeFormatter myDateTimeFormat = DateTimeFormatter.ofPattern("M/d/yy H:mm");
    private long cardNumber;
    private String paymentType;
    private LocalDateTime accountCreated;
    private ArrayList<LocalDateTime> transactionDates = new ArrayList<LocalDateTime>();

    Account(long cardNumber, String paymentType, String accountCreated){
        this.cardNumber = cardNumber;
        this.paymentType = paymentType;
        this.accountCreated = LocalDateTime.parse(accountCreated, myDateTimeFormat);
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getAccountCreatedAsString() {
        return accountCreated.format(myDateTimeFormat);
    }

    public boolean validateCardNumber(){
        //Arraylist with every digit of cardNumber
        ArrayList<Integer> arrListOfInts = convertLongToArrListOfInts(this.cardNumber);

        // Modify our prev. ArrayList by doubling up every other digit starting from the right
        // If the doubled up digit was over 9, modify it by summing up its two digits, before adding it back to the ArrayList
        arrListOfInts = doubleUpEveryOtherIntInArrListOfInts(arrListOfInts);

        int sumOfArrListOfInts = sumOfArrListsOfInts(arrListOfInts);

        if(sumOfArrListOfInts % 10 == 0){
            System.out.println("Card number accepted.");
            return true;
        }
        System.out.println("Card number invalid.");
        return false;
    }

    public ArrayList<Integer> convertLongToArrListOfInts(long longToConvert){
        String numberAsString = String.valueOf(longToConvert); // Set int number, convert to string
        char[] digitsAsCharArr = numberAsString.toCharArray(); // Split String number, convert to char and save in array.
        ArrayList<Integer> digitsAsIntArr = new ArrayList<Integer>();

        // char numeric value, add as int to digitsAsIntArr
        for(char digit : digitsAsCharArr){
            digitsAsIntArr.add(Character.getNumericValue(digit));
        }

        return digitsAsIntArr;
    }

    public ArrayList<Integer> doubleUpEveryOtherIntInArrListOfInts(ArrayList<Integer> arrListToModify){
        for(int i = arrListToModify.size()-2; i >= 0; i-=2){
            int doubledInt = arrListToModify.get(i) * 2;
            ArrayList<Integer> doubledIntDigits;

            if(doubledInt > 9){
                doubledIntDigits = convertLongToArrListOfInts(doubledInt);

                doubledInt = doubledIntDigits.get(0) + doubledIntDigits.get(1);
            }

            arrListToModify.set(i, doubledInt);
        }
        return arrListToModify;
    }

    public int sumOfArrListsOfInts(ArrayList<Integer> arrListToSum){
        int sum = 0;

        for(int i = 0; i < arrListToSum.size(); i++){
            sum += arrListToSum.get(i);
        }
        return sum;
    }

}
