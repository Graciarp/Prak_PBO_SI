package com.gracia.praktikum3;

import java.util.Scanner;

public class BelajarJava4 {
    public static void main(String[] args) {
        boolean a = true, b = false, hasil;

        hasil = a && b;
        System.out.println("Hasil dari a && b : "+hasil);
//        AND : Bernilai benar ketika kedua variable/nilai yang dibandingkan bernilai benar

        hasil = a || b;
        System.out.println("Hasil dari a || b : "+hasil);
//        OR : Bernilai benar ketika salah satu variable/nilai yang dibandingkan bernilai benar

        hasil = !b;
        System.out.println("Hasil dari !b : "+hasil);
//        NOT : Kebalikan dari variable/nilai yang dibandingkan

//        Mencetak bilangan positif dan bilangan genap/ganjil
//        Deklarasi variable
        int bil1, bil2, total;
//        Object untuk menginputkan
        Scanner scanner = new Scanner(System.in);
//        Scanner nama_variable = new Scanner(System.in)

        System.out.print("Masukkan bilangan 1 : ");
        bil1 = scanner.nextInt();

        System.out.print("Masukkan bilangan 2 : ");
        bil2 = scanner.nextInt();

        total = bil1%2; //operator aritmatika (modulus)
        if(total == 0){ //operator pembanding
            total = bil1/bil2;
            if(total > 0){ //operator pembanding
                System.out.println("Bilangan "+total+" Merupakan bilangan genap positif");
            } else {
                System.out.println("Bilangan "+total+" Merupakan bilangan genap negatif");
            }
        } else {
            total = bil1/bil2;
            if(total > 0){
                System.out.println("Bilangan "+total+" Merupakan bilangan ganjil positif");
            } else {
                System.out.println("Bilangan "+total+" Merupakan bilangan ganjil negatif");
            }
        }
    }
}
