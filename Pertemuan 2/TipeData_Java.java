package com.gracia.Praktikum2;

public class TipeData_Java {
    public static void main(String[] args) {
//        type_data nama_variable;
//        type_data nama_variable = nilai;

//        inisiasi variable
        int bilangan1 = 5, bilangan2 = 10;
        double bilangan3;
        char huruf = 'A';
        String kalimat = "Hallo, nama saya Gracia\n Saya tinggal disini";
        String nama_depan = "Gracia", nama_tengah = "Rizka", nama_belakang = "Pasfica";
        String nama_lengkap = "Gracia Rizka Pasfica";

        System.out.println("Selamat sore"); //mencetak data bernilai "Selamat sore"

//        deklarasi nilai dari variable bilangan3
        bilangan3 = 3.14;
        //        memanggil variable untuk dicetak
        System.out.println(kalimat);
        System.out.println("Bilangan 3 bernilai "+bilangan3);
        System.out.println(bilangan1+" "+bilangan2);
        System.out.println("Nama saya : "+nama_depan+" "+nama_tengah+" "+nama_belakang);
        System.out.println("Nama saya : "+nama_lengkap);
    }
}
