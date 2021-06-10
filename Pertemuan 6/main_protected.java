package com.gracia.pertemuan_6;

import java.util.Scanner;

public class main_protected extends data_class{
    public static void main(String[] args) {
//      Object Scanner
        Scanner scanner = new Scanner(System.in);

//      Object
        data_class obj = new data_class();

//      Memanggil method pilih_prodi
        obj.pilih_prodi();
        System.out.println();
        obj.tampil_prodi();
    }
}
