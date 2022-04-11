package com.company;

public class Main {

    public static void main(String[] args) {
        String snake = "~:======" + truncator("Haas") + "=======-";
        char[][] printer = new 
    }

    public static String truncator(String in){
        if(in.length() > 40){
            return in.substring(0,40);
        }
        else return in;
    }

}
