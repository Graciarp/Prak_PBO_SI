package com.gracia.modul5;

public class DemoConstructor {
//    Untuk mendemokan class constructor
    public static void main(String[] args) {
//        Deklarasi object
//        nama_class nama_obj = new nama_class();
//        Object memanggil constructor tanpa parameter
        Constructor object1 = new Constructor();

//        Isi nilai untuk atribut
        object1.nama = "Gracia";
        object1.nim = 19;

        System.out.println("\nCetak dengan constructor tanpa parameter");
//        Cetak data
        System.out.println("Nama : "+object1.nama);
        System.out.println("NIM : "+object1.nim);

        System.out.println("\nCetak dengan constructor satu parameter");

//        Object untuk memanggil construtor satu parameter
        Constructor object2 = new Constructor("Gracia");
        Constructor object3 = new Constructor("Rizka");
        Constructor object4 = new Constructor("Pasfica");
//        Cetak data
        System.out.println("Nama Lengkap : "+object2.nama+" "+object3.nama+" "+object4.nama);
        System.out.println();

//        Object untuk memanggil constructor dua parameter
        Constructor object5 = new Constructor("Gracia",19104064);
        Constructor object6 = new Constructor("Rizka",20104064);

//        Cetak data
        System.out.println("\nCetak dengan constructor dua parameter");
        System.out.println("Nama : "+object5.nama);
        System.out.println("NIM : "+object5.nim);
        System.out.println("Angkatan : "+object5.angkatan);
        System.out.println();
        System.out.println("Nama : "+object6.nama);
        System.out.println("NIM : "+object6.nim);
        System.out.println("Angkatan : "+object6.angkatan);
    }
}
