package Smart_Home;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GestoreSmartHome {

    private ArrayList<Dispositivo> DispositiviinstallatiCasa = new ArrayList<>();

    public GestoreSmartHome(ArrayList<Dispositivo> dispositiviinstallatiCasa) {
        DispositiviinstallatiCasa = dispositiviinstallatiCasa;
    }

    public Boolean agggiungiDispositivo(Dispositivo device) {
        if(!(DispositiviinstallatiCasa.contains(device))) {
            DispositiviinstallatiCasa.add(device);
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
