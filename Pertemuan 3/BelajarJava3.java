package com.gracia.praktikum3;

public class BelajarJava3 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean hasil;

        hasil = a==b;
        System.out.println("Apakah nilai "+a+" == "+b+" ? "+hasil);

        hasil = a!=b;
        System.out.println("Apakah nilai "+a+" != "+b+" ? "+hasil);

        hasil = a>b;
        System.out.println("Apakah nilai "+a+" > "+b+" ? "+hasil);

        hasil = a<b;
        System.out.println("Apakah nilai "+a+" < "+b+" ? "+hasil);

        hasil = a>=b;
        System.out.println("Apakah nilai "+a+" >= "+b+" ? "+hasil);

        hasil = a<=b;
        System.out.println("Apakah nilai "+a+" <= "+b+" ? "+hasil);
    }
}
