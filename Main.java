package com.company;

public class Main {

    public static void main(String[] args) {
        Bank Private = new Bank("Private", 50, 60);
        Bank Mono = new Bank();
        Bank Oschad = new Bank("Oschad", 100, 120, 30, "Anonim", 333);
        System.out.println(Private);
        System.out.println(Mono);
        System.out.println(Oschad);
    }
}
