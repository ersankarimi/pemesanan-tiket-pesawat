package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PilihKelas {

    // variabel
    private Scanner sc = new Scanner(System.in);
    protected byte pilKelas;
    List<String> daftarKelas;

    // constructor
    public PilihKelas(){

        // menambahkan daftar kelas
        daftarKelas = new ArrayList<>();
        daftarKelas.addAll(List.of("1. Business Class", "2. Economy Class"));

        pilihKelas();
    }

    //method

    public void pilihKelas(){
        System.out.println("=====================================");
        System.out.println("Silahkan Pilih Kelas Penerbangan Anda");
        System.out.println("=====================================");

        for (var kelas : daftarKelas){
            System.out.println(kelas);
        }

        System.out.println(" ");

        System.out.print("Masukkan Pilihan [1-2] : ");
        this.pilKelas = sc.nextByte();
        if (this.pilKelas > 2){
            System.out.println(" ");
            System.out.println("Kelas yang Dipilih Salah!");
            System.out.println("Silahkan Pilih Sesuai Pilihan!");
            System.out.println(" ");
            pilihKelas();
        }
        System.out.println(" ");
    }
}
