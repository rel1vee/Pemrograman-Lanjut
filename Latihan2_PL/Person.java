package Latihan2_PL;

public class Person {
    String nama;
    int umur;

    Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    void ucapkanHalo(){
        System.out.println("Halo, nama saya " + nama);
    }

    void tampilUmur(){
        System.out.println(nama + " saat ini berumur " + umur + " tahun");
    }

    boolean dewasa(){
        return umur >= 18;
    }
}

/*
Ini merupakan kelas Person yang memiliki tiga atribut yaitu nama, umur, dan tiga metode.
Metode konstruktor Person digunakan untuk menginisialisasi nilai nama dan umur ketika objek Person dibuat.
Metode ucapkanHalo() akan mencetak pesan "Halo, nama saya [nama]".
Metode tampilUmur() akan mencetak pesan "[nama] saat ini berumur [umur] tahun".
Metode dewasa() akan mengembalikan nilai boolean true jika umur objek Person lebih besar atau sama dengan 18,
atau mengembalikan false jika sebaliknya.
*/