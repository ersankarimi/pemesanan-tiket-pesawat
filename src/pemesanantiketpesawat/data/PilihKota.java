package pemesanantiketpesawat.data;

import java.util.*;

public class PilihKota {

    // variabel
    private Scanner sc = new Scanner(System.in);
    private  List<String> daftarKota;

    // variabel inputan
    protected byte pilKotaAsal;
    protected byte pilKotaTujuan;


    // constructor
    public PilihKota(){

        // add daftar kota
        daftarKota = new ArrayList<>();
        daftarKota.addAll(List.of("1. Bandung", "2. Jakarta", "3. Medan", "4. Makassar", "5. Exit"));

        pilihKota();
    }


    // method pilihan kota asal
    public void kotaAsal(){
        System.out.println("Silahkan Pilih Kota Asal Anda!");
        System.out.println("--------------------------------");

        // iterasi untuk daftarKota
        for (var kota : daftarKota){
            System.out.println(kota);
        }

        System.out.println("--------------------------------");
        System.out.println(" ");

        System.out.print("Masukkan Pilihan [1-5] : ");
        this.pilKotaAsal = sc.nextByte();
        System.out.println(" ");
    }

    // method pilihan kota tujuan
    public void kotaTujuan(){
        System.out.println("Silahkan Pilih Kota Tujuan Anda!");
        System.out.println("--------------------------------");


        //iterasi untuk daftarKota
        for (var kota : daftarKota){
            System.out.println(kota);
        }

        System.out.println("--------------------------------");
        System.out.println(" ");

        System.out.print("Masukkan Pilihan [1-5] : ");
        this.pilKotaTujuan = sc.nextByte();

        if (this.pilKotaTujuan == this.pilKotaAsal){
            System.out.println(" ");
            System.out.println("Kota Tujuan Tidak Boleh Sama dgn Kota Asal!");
            System.out.println("Silahkan Pilih Kota yg Berbeda dgn Kota Asal!");
            System.out.println(" ");
            kotaTujuan();
        }
        else if (this.pilKotaTujuan == 5){
            exitPil();
        } else if (this.pilKotaTujuan > 5){
            elsePil();
            kotaTujuan();
        }
        System.out.println(" ");

    }

    // method exit
    private void exitPil() {
        System.out.println("Terima Kasih Telah Menggunakan Program Kami");
        System.exit(0);
    }

    // method jika pilihan tidak ada di daftar
    private void elsePil() {
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("Maaf Pilihan Tidak Ada di Daftar!");
        System.out.println("Silahkan Pilih Sesuai Pilihan yang Tersedia!");
        System.out.println("--------------------------------------------");
        System.out.println(" ");
    }

    // method
    public PilihKota pilihKota(){
        kotaAsal();
        if (this.pilKotaAsal == 1){
            kotaTujuan();
        } else if (this.pilKotaAsal == 2){
            kotaTujuan();
        } else if (this.pilKotaAsal == 3){
            kotaTujuan();
        } else if (this.pilKotaAsal == 4){
            kotaTujuan();
        } else if (this.pilKotaAsal == 5){
            exitPil();
        } else {
            elsePil();
            return pilihKota();
        }

        return null;
    }

}
