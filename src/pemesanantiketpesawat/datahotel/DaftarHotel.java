package pemesanantiketpesawat.datahotel;

public class DaftarHotel {

    // variabel
    KotaHotel kotaHotelDaftarHotel = null;

    public DaftarHotel(KotaHotel kotaHotelDaftarHotel) {
        this.kotaHotelDaftarHotel = kotaHotelDaftarHotel;
    }

    public void kotaBandung(){
        System.out.println("Kota Tujuan Penerbangan Anda : " + kotaHotelDaftarHotel.getKotaTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Nama" + "\t\t\t\t\t\t\t\t\t" + "| Alamat" + "\t\t\t\t\t\t"+ "| Kualitas" + "\t\t" + "| Harga");
        System.out.println("Hotel " + "\t\t\t\t\t\t\t\t\t" +"| Hotel" + "\t\t\t\t\t\t\t" + "| Hotel" + "\t\t\t" + "| per Malam");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("1. Grand Tjokro Premiere Bandung" + "\t\t" + "| Jln. Cihampelas No.211-217" + "\t" + "| ⭐⭐⭐⭐" + "\t\t" + "| RP 550.000");
        System.out.println("2. Ibis Trans Studio" + "\t\t\t\t\t" + "| Jln. Gatot Subroto No.289" + "\t\t" + "| ⭐⭐⭐" + "\t\t\t" + "| RP 400.000");
        System.out.println("3. The Luxury Hotel Bandung" + "\t\t\t\t" + "| Jln. Gatot Subroto No.289" + "\t\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 700.000");

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void kotaJakarta(){
        System.out.println("Kota Tujuan Penerbangan Anda : " + kotaHotelDaftarHotel.getKotaTujuan());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Nama" + "\t\t\t\t\t\t\t\t\t\t\t" + "| Alamat" + "\t\t\t\t\t\t\t\t\t\t\t\t"+ "| Kualitas" + "\t\t" + "| Harga");
        System.out.println("Hotel " + "\t\t\t\t\t\t\t\t\t\t\t" +"| Hotel" + "\t\t\t\t\t\t\t\t\t\t\t\t\t" + "| Hotel" + "\t\t\t" + "| per Malam");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1. Ascott Sudirman Jakarta" + "\t\t\t\t\t\t" + "| Jln.Prof. Dr. Satrio Kav. 11" + "\t\t\t\t\t\t\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 890.000");
        System.out.println("2. Four Seasons Hotel Jakarta" + "\t\t\t\t\t" + "| Jln. Jendral Gatot Subroto Kav 18" + "\t\t\t\t\t\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 850.000");
        System.out.println("3. The Ritz-Carlton Jakarta, Mega Kuningan" + "\t\t" + "| Jln. Dr. Ide Anak agung Gde agung Kav. E. 11 No.1" + "\t\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 889.000");

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void kotaMedan(){
        System.out.println("Kota Tujuan Penerbangan Anda : " + kotaHotelDaftarHotel.getKotaTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Nama" + "\t\t\t\t\t\t\t" + "| Alamat" + "\t\t\t\t\t\t"+ "| Kualitas" + "\t\t" + "| Harga");
        System.out.println("Hotel " + "\t\t\t\t\t\t\t" +"| Hotel" + "\t\t\t\t\t\t\t" + "| Hotel" + "\t\t\t" + "| per Malam");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("1. JW Marriott Hotel Medan" + "\t\t" + "| Jln. Putri Hijau No. 10" + "\t\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 770.000");
        System.out.println("2. Swiss-berlin Medan" + "\t\t\t" + "| Jln. Surabaya No. 88" + "\t\t\t" + "| ⭐⭐⭐" + "\t\t\t" + "| RP 440.000");
        System.out.println("3. De'Tonga Hotel" + "\t\t\t\t" + "| Jln. Sei Balutu, 20154 Medan" + "\t" + "| ⭐⭐⭐" + "\t\t\t" + "| RP 450.000");

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void kotaMakassar(){
        System.out.println("Kota Tujuan Penerbangan Anda : " + kotaHotelDaftarHotel.getKotaTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Nama" + "\t\t\t\t\t\t\t\t\t\t" + "| Alamat" + "\t\t\t\t\t\t\t"+ "| Kualitas" + "\t\t" + "| Harga");
        System.out.println("Hotel " + "\t\t\t\t\t\t\t\t\t\t" +"| Hotel" + "\t\t\t\t\t\t\t\t" + "| Hotel" + "\t\t\t" + "| per Malam");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("1. The Rinra Hotel" + "\t\t\t\t\t\t\t" + "| Jln. Metro Tanjung Bunga No. 2" + "\t" + "| ⭐⭐⭐⭐⭐" + "\t\t" + "| RP 750.000");
        System.out.println("2. Arthama Hotels Makassar" + "\t\t\t\t\t" + "| Jln. Haji Bau No. 5" + "\t\t\t\t" + "| ⭐⭐⭐⭐" + "\t\t" + "| RP 550.000");
        System.out.println("3. Four Points by Sheraton Makassar" + "\t\t\t" + "| Jln. Andi djemma No. 130" + "\t\t\t" + "| ⭐⭐⭐⭐" + "\t\t" + "| RP 580.000");

        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    // pilihan kelima
    public void exitPil(){
        System.out.println("Terima Kasih Telah Menggunakan Program Kami");
        System.exit(0);
    }

    // jika pilihan tidak ada di daftar
    public void elsePil(){
        System.out.println("Maaf Pilihan Tidak Ada di Daftar!");
        System.out.println("Silahkan Pilih Sesuai Pilihan yang Tersedia!");
        System.out.println(" ");
    }
}
