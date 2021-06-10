package com.gracia.pertemuan_6;

import java.util.Scanner;

//  Contoh access modifier public
public class data_class {
    //  Deklarasi variable
    public String[] nama, alamat, hobi;
    private int[] nim;
    protected String prodi;

    //  Object Scanner untuk input data
    private Scanner scanner_String1 = new Scanner(System.in);
    private Scanner scanner_String2 = new Scanner(System.in);
    private Scanner scanner_int1 = new Scanner(System.in);
    private Scanner scanner_int2 = new Scanner(System.in);


    //  Constructor tanpa parameter
    public data_class() { }


//  Method void untuk input biodata dengan akses "public
    public void bio(int jml_bio) {
//      Deklarasi Jumlah array
        nama = new String[jml_bio];
        nim = new int[jml_bio];
//      Input Biodata
        for (int i = 0; i < jml_bio; i++) {
            System.out.println("[Biodata ke-" + (i + 1) + "]");
            System.out.print("Input Nama \t\t\t: ");
            nama[i] = scanner_String1.nextLine(); // input data array (nextInt karena bertipe data integer)
            System.out.print("Input NIM \t\t\t: ");
            nim[i] = scanner_int2.nextInt(); // input data array (nextInt karena bertipe data integer)
            System.out.println();
        }
    }


//  Method void untuk menampilkan biodata yang diinputkan dengan akses "public"
    public void tampilBio(int jml_bio) {
        for (int i = 0; i < jml_bio; i++) {
            System.out.println("[Biodata ke-" + (i + 1) + "]");
            System.out.println("Nama \t\t\t\t: " + nama[i]);
            System.out.println("NIM \t\t\t\t: " + nim[i]);
            System.out.println();
        }
    }


//  Method untuk input prodi dengan akses protected
    protected String pilih_prodi(){
        System.out.println("Prodi yang dipilih: ");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa Perangkat Lunak");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        int pil = scanner_int1.nextInt();
        switch (pil) {
            case 1:
                prodi = "Teknik Informatika";
                break;
            case 2:
                prodi = "Sistem Informasi";
                break;
            case 3:
                prodi = "Rekayasa Perangkat Lunak";
                break;
            default:
                prodi = "Tidak ada dalam pilihan";
                break;
        }
        return prodi;
    }

//  Method untuk tampilkan prodi yang dipilih dengan akses protected
    protected void tampil_prodi(){
        System.out.println("Prodi yang dipilih adalah : "+prodi);
    }


//  Method input hobi dengan akses private
    private void input_hobi(){
        System.out.print("Input Jumlah Hobi \t: ");
        int jml_hobi = scanner_int1.nextInt();
        hobi = new String[jml_hobi];
        for (int j = 0; j < jml_hobi; j++) {
            System.out.print("\t\tHobi ke-" + (j + 1) + " \t: ");
            hobi[j] = scanner_String2.nextLine(); // input data array (nextLine karena bertipe data String)
        }
    }


//  Method untuk menampilkan hobi yang diinputkan dengan akses private
    private void tampil_hobi(){
        for (int i = 0; i < hobi.length; i++) {
            System.out.println("Hobi ke-"+(i+1)+" \t: "+hobi[i]);
        }
        System.out.println();
    }
    
    
//  Method main untuk menjalankan method private
    public static void main(String[] args) {
        data_class obj = new data_class();
        obj.input_hobi();
        System.out.println();
        System.out.println("Cetak hobi \t: ");
        obj.tampil_hobi();
    }
}
