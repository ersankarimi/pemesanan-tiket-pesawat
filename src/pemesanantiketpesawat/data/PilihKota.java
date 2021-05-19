package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PilihKota {

    // variabel
    private Scanner sc = new Scanner(System.in);
    private List<String> daftarKota = new ArrayList<>();

    public PilihKota(){

        kotaAsal();
    }

    // method daftar-daftar kota
    public void kotaDaftar(){
        daftarKota.addAll(List.of("1. Bandung", "2. Jakarta", "3. Medan", "4. Makassar", "5. Exit"));
        for (var kota : daftarKota){
            System.out.println(kota);
        }
    }

    public void kotaAsal(){
        System.out.println("Silahkan Pilih Kota Asal Anda!");
        System.out.println("--------------------------------");
        kotaDaftar();
        System.out.println("--------------------------------");
        System.out.println(" ");

    }
}
