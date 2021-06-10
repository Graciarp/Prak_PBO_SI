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

        System.out.print("Jumlah mahasiswa yang akan diinputkan : ");
        jml_mhs = scanner.nextInt();
        System.out.println();

//      Memanggil method bio
        run.bio(jml_mhs); // parameter diisi nilai yang diinputkan pada variable jml_mhs

//      Memanggil method tampilbio
        run.tampilBio(jml_mhs);
    }
}
