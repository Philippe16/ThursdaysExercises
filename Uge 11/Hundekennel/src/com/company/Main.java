package com.company;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


    }


    public class Dog {

        Dog(String name, boolean isHungry) {
            this.name = name;
            this.isHungry = isHungry;
        }

        private String name;
        private String owner;
        private String[] offSpring = new String[8];


        public boolean isHungry;


        public String feedDog() {
            if (isHungry == true) {
                isHungry = false;
                return "Dog has now been fed";
            }

            return "Dog is not hungry right now";
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setOffSpring(String offspringName) {
            for (int i = offSpring.length - 1; i >= 0; i--) {


                if (offSpring[i] == null) {
                    offSpring[i] = offspringName;
                }
                return;
            }
            Arrays.copyOf(offSpring, 9);
            offSpring = Arrays.copyOf(offSpring, 9);
            offSpring[offSpring.length-1] = offspringName;
        }

    }
}



