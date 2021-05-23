package pemesanantiketpesawat.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IdTicket {

    Penumpang penumpangId = null;
    protected String idTiket;
    List<String> daftarRandomChar = new ArrayList<>();

    // constructor


    public IdTicket(Penumpang penumpangId) {
        this.penumpangId = penumpangId;
        makeId();
    }

    public void makeId(){
        for (int i = 0; i < penumpangId.jumPenumpang;i++){
            idTiket = UUID.randomUUID().toString();
            daftarRandomChar.add(idTiket);
        }
    }
}
