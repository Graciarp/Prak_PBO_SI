package com.gracia.modul5;

public class Constructor {
//    Deklarasi atribut
    String nama, angkatan;
    int nim;

//    Constructor tanpa parameter
    Constructor() { }

//    Constructor satu parameter
    public Constructor(String nama_orang) {
        this.nama = nama_orang;
    }

//    Constructor dua parameter
    public Constructor(String nama_orang, int nim_mhs) {
        this.nama = nama_orang;
        this.nim = nim_mhs;
    }

    public void angkatan(int nim_mhs){
        if(nim_mhs == 19104064){
            angkatan = "2019";
        } else if(nim_mhs == 20104064){
            angkatan = "2020";
        } else {
            angkatan = "bukan mahasiswa";
        }
    }

    public static void main(String[] args) {
//        Deklarasi object
//        nama_class nama_obj = new nama_class();
//        Object memanggil constructor tanpa parameter
        Constructor object1 = new Constructor();

//        Isi nilai untuk atribut
        object1.nama = "Gracia";
        object1.nim = 19;

//        Cetak data
        System.out.println("Nama : "+object1.nama);
        System.out.println("NIM : "+object1.nim);

//        Object untuk memanggil construtor satu parameter
        Constructor object2 = new Constructor("Gracia");
        Constructor object3 = new Constructor("Rizka");
        Constructor object4 = new Constructor("Pasfica");
//        Cetak data
        System.out.println("Nama Lengkap : "+object2.nama+" "+object3.nama+" "+object4.nama);
    }
}
