package esercizi_02_04_26.SmartHome;

public class ReteWifi {
    // non si harcoda mai niente è per l'esercizio
private final String SSID = "Dlink-21" ;
private final String password = "1234";

    public ReteWifi() {

    }


    public Boolean verificaAuenticazione(String nomeRete, String password) {
        return this.getPassword().equals(password) && this.getSSID().equals(nomeRete);
    }

    private String getSSID() {
        return SSID;
    }

    private String getPassword() {
        return password;
    }
}



