package com.gracia.pertemuan_6;

import java.util.Scanner;

//  Akses class "public_access" dari class "main_public"

public class main_public {
    public static void main(String[] args) {
//      Object Scanner
        Scanner scanner = new Scanner(System.in);

//      Deklarasi variable
        int jml_mhs;

//      Object
        data_class run = new data_class();
/*
    Object dalam satu class yang sama, digunakan jika method atau variable yang dipanggil tidak
    menggunakan access specifier "static" karena pada main menggunakan access "static"
 */
        System.out.print("Jumlah mahasiswa yang akan diinputkan : ");
        jml_mhs = scanner.nextInt();
        System.out.println();

//      Memanggil method bio
        run.bio(jml_mhs); // parameter diisi nilai yang diinputkan pada variable jml_mhs

//      Memanggil method tampilbio
        run.tampilBio(jml_mhs);
/*
    Angka yang diinputkan pada parameter bebas, karena untuk menampung jumlah array yang
    akan diinputkan
 */
    }
}
