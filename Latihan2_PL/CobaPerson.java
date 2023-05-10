package Latihan2_PL;

public class CobaPerson{
     public static void main(String[] args) {
        // membuat objek baru dari class Person
        Person orang = new Person("Zaki", 18);

        // memanggil method void
        orang.ucapkanHalo();
        orang.tampilUmur();

        // memanggil method non-void
        if (orang.dewasa()) {
            System.out.println(orang.nama + " sudah dewasa");
        } else {
            System.out.println(orang.nama + " belum dewasa");
        }
    }
}

/*
Ini adalah kelas CobaPerson sebagai program utama untuk menguji kelas Person.
Di dalam method main(), terdapat penggunaan kelas Person dengan membuat objek baru bernama orang dengan nilai nama dan umur yang telah ditentukan. 
Selanjutnya, dilakukan pemanggilan metode ucapkanHalo() dan tampilUmur() untuk mencetak pesan.
Kemudian, dilakukan pengujian pada metode dewasa(). 
Jika nilai yang dikembalikan adalah true, maka pesan "Zaki sudah dewasa" akan ditampilkan.
Jika nilai yang dikembalikan adalah false, maka pesan "Zaki belum dewasa" akan ditampilan.
*/