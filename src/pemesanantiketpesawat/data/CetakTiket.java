package pemesanantiketpesawat.data;

public class CetakTiket {
    SetNamaMaskapai setNamaMaskapaiCetak = null;
    Penumpang penumpangCetak = null;
    SetKota setKotaCetak = null;
    IdTicket idTicketCetak = null;



    public CetakTiket(SetNamaMaskapai setNamaMaskapaiCetak, Penumpang penumpangCetak, SetKota setKotaCetak, IdTicket idTicketCetak) {
        this.setNamaMaskapaiCetak = setNamaMaskapaiCetak;
        this.penumpangCetak = penumpangCetak;
        this.setKotaCetak = setKotaCetak;
        this.idTicketCetak = idTicketCetak;
        patternTiket();
    }


    public void patternTiket(){
        for (int i = 0;i < penumpangCetak.jumPenumpang;i++){
            System.out.println("Tiket Atas Nama " + penumpangCetak.daftarNamaPenumpang.get(i));

            System.out.println("------------------------------------------------");
            System.out.println("        _            _                       \r\n   __ _(_)_ __ _ __ | | __ _ _ __   ___  ___ \r\n  / _` | | '__| '_ \\| |/ _` | '_ \\ / _ \\/ __|\r\n | (_| | | |  | |_) | | (_| | | | |  __/\\__ \\\r\n  \\__,_|_|_|  | .__/|_|\\__,_|_| |_|\\___||___/\r\n              |_|         ");
            System.out.println("Maskapai  : " + setNamaMaskapaiCetak.getNamaMaskapai());
            System.out.println("Nama      : " + penumpangCetak.daftarNamaPenumpang.get(i));
            System.out.println("From      : " + setKotaCetak.getKotaAsal());
            System.out.println("To        : " + setKotaCetak.getKotaTujuan());
            System.out.println("Id Ticket : " + idTicketCetak.daftarRandomChar.get(i));

            System.out.println("------------------------------------------------");
            System.out.println(" ");
        }
    }

    //System.out.println("           _\r\n         -=\\`\\\r\n     |\\ ____\\_\\__\r\n   -=\\c`\"\"\"\"\"\"\" \"`)\r\n      `~~~~~/ /~~`\r\n        -==/ /\r\n          '-'");

    //System.out.println("        _            _                       \r\n   __ _(_)_ __ _ __ | | __ _ _ __   ___  ___ \r\n  / _` | | '__| '_ \\| |/ _` | '_ \\ / _ \\/ __|\r\n | (_| | | |  | |_) | | (_| | | | |  __/\\__ \\\r\n  \\__,_|_|_|  | .__/|_|\\__,_|_| |_|\\___||___/\r\n              |_|         ");
}
