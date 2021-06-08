package pemesanantiketpesawat.data;

import java.util.Scanner;

public class PilihKodePenerbangan {

    // variabel
    private final Scanner sc = new Scanner(System.in);
    private int pilKodePenerbangan;
    private int kodePenerbangan;


    // constructor
    public PilihKodePenerbangan(){
        pilihKodePenerbangan();
    }



    // method untuk meng-input kode penerbangan
    public void pilihKodePenerbangan(){
        // proses set kode penerbangan
        System.out.print("Pilih Kode Penerbangan yang Tersedia : ");
        this.pilKodePenerbangan = sc.nextInt();
        setKodePenerbangan(pilKodePenerbangan);
        System.out.println(" ");
    }

    // method setter dan getter
    public int getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(int kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

}
