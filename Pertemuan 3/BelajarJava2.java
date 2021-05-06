package com.gracia.praktikum3;

public class BelajarJava2 {
    public static void main(String[] args) {
//        Increment dan Decrement
        int a = 10;
        a++; //contoh penggunaan increment
        System.out.println("Isi variable a : "+a);

        int b = 10;
        b--; //contoh penggunaan decrement
        System.out.println("Isi variable b : "+b);

        int c = 15;
        System.out.println("Isi variable c : "+c);
        c++;
        System.out.println("Isi variable c : "+c);
        ++c;
        System.out.println("Isi variable c : "+c);

        for (int i = 0; i < 5; i++) {
            System.out.println("nilai ke-"+i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println("nilai ke-"+i);
        }

//        Operator penugasan
        int z = 10;
        z += 2;
//        z = z + 2
//        z = 3 + 2 = 5
        System.out.println("Nilai z = "+z);

        z <<= 3;
        System.out.println("Nilai z = "+z);
    }
}
