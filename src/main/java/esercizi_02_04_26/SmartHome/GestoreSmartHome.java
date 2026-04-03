package esercizi_02_04_26.SmartHome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GestoreSmartHome {

    private ArrayList<Dispositivo> dispositiviinstallatiCasa = new ArrayList<>();

    public GestoreSmartHome(ArrayList<Dispositivo> dispositiviinstallatiCasa) {
        this.dispositiviinstallatiCasa = dispositiviinstallatiCasa;
    }

    public Boolean agggiungiDispositivo(Dispositivo device) {
        if(!(dispositiviinstallatiCasa.contains(device))) {
            dispositiviinstallatiCasa.add(device);
            return  true;
        }

        return false;
    }
    public void salvaReportConsumi(String percorsoFile) throws IOException {
        if(Objects.equals(percorsoFile, "")){
            throw new IOException("File non valido");
        }
    }


}
