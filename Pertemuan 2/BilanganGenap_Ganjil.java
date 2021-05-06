package com.gracia.Praktikum2;

import java.util.Scanner;

public class BilanganGenap_Ganjil {
//    Program untuk menentukan bilangan ganjil atau genap
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Perintah untuk menginputkan

//        Deklarasi variable
        int bil1, bil2, hasil;
        boolean genap = false;

        System.out.print("Inputkan bilangan pertama : ");
        System.out.println();
        bil1 = input.nextInt();
        System.out.print("Inputkan bilangan kedua : ");
        bil2 = input.nextInt();
        if(bil1%bil2==0){
            genap = true;
            hasil = bil1/bil2;
            System.out.println("Hasil : "+hasil);
            System.out.println("Bilangan bernilai genap ("+genap+")");
        } else {
            genap= false;
            System.out.println("Bilangan bernilai genap ("+genap+")");
        }
    }
}
