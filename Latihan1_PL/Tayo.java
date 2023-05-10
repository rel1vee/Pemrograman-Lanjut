package Latihan1_PL;

public class Tayo {
    String merek      = "Tayo";
    String warna      = "Biru";
    String nomor_plat = "BM 1234 TIF";
    int jumlah_roda   = 6;
    double kecepatan  = 60.0;
    double waktu      = 2.0;
   
    void view(){
        System.out.println("Merek Mobil \t: " + merek);
        System.out.println("Warna Mobil \t: " + warna);
        System.out.println("Jumlah Roda \t: " + jumlah_roda);
        System.out.println("Nomor Plat \t: " + nomor_plat);
        System.out.println("Kecepatan \t: " + kecepatan + " km/jam");
        System.out.println("Waktu Tempuh \t: " + waktu + " jam");
    }
    
    void hitung_jarak (String distance){
        System.out.println(distance + kecepatan*waktu + " km");
    }
}