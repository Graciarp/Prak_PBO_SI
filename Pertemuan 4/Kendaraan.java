package com.gracia.class_object;

public class Kendaraan {
    public static void main(String[] args) {
//        deklarasi object
        Motor obj_kendaraan = new Motor();
//        memberi nilai pada atribut warna
        obj_kendaraan.warna = "Hitam";
//        cetak data
        System.out.println("Kendaraan 1 : ");
        System.out.println("Merk kendaraan \t: "+obj_kendaraan.merek);
        System.out.println("Warna kendaraan : "+obj_kendaraan.warna);
        System.out.println("Pemilik kendaraan : "+obj_kendaraan.pemilik);

        System.out.println("Keterangan : ");
        //obj_kendaraan.gas();
        System.out.println("Warna kendaraan : "+obj_kendaraan.warnaKendaraan());
    }
}
