package com.gracia.class_object;

public class Motor {
//    Definisi attributes
//    1. type_data nama_atribut = nilai
//    2. type_data nama_atribut
//    3. access_specifier type_data nama_atribut

//    contoh 1:
    String merek = "Honda";

//    contoh 2:
    String warna;

//    contoh 3:
    public String pemilik="Otong";

//    Definisi method
    /*
        1. Method void
           access_specifier access_modifier void nama_method(parameter){
                isi method
           }
        2. Method return
           access_specifier access_modifier type_data nama_method(parameter){
                isi method
                return nilai/variable yang memiliki typedata sama dengan methodnya
           }
     */

//  contoh method 1:
    private void gas(){
        System.out.println("gasskeunn");
    }

//    contoh method 2
    static void rem(){
        System.out.println("stop sik gan");
    }

//    contoh method 3
    public String warnaKendaraan(){
        warna = "putih"; //memanggil atribut warna
        return warna;
    }

    public static void main(String[] args) {
//        Deklarasi object
//        nama_class nama_object = new nama_class();
        Motor obj_gas = new Motor();
        obj_gas.gas(); //memanggil method gas
        System.out.println("Warna kendaraan : "+obj_gas.warnaKendaraan()); //memanggil method warna kendaraan
        rem(); //memanggil method rem tanpa object
        System.out.println("Pemilik kendaraan : "+obj_gas.pemilik);//memanggil atribut
    }
}
