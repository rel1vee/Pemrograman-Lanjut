package StudiKasusInheritance;

public class cetakNota {
    public static void main(String[] args){
        dataPembeli p;
        p = new dataPembeli("001","Zaki","Jl. Garuda Sakti","085123123123",  
                            "011","Buku Paperline","Penggaris","Farras");
        
        p.setHarga1(5000);
        p.setHarga2(2500);
        p.info();
    } 
}