package SmartHome;

public class ReteWifi {
    // non si harcoda mai niente è per l'esercizio
private String SSID = "Dlink-21" ;
private String password = "1234";

    public ReteWifi() {

    }


    public Boolean verificaAuenticazione(String nomeRete, String password) {
        if(this.getPassword().equals(password) && this.getSSID().equals(nomeRete)) {
            return true;
        }
        return false;
    }

    private String getSSID() {
        return SSID;
    }

    private String getPassword() {
        return password;
    }
}



