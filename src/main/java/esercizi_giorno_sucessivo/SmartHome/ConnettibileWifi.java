package esercizi_giorno_sucessivo.SmartHome;

public interface ConnettibileWifi {
    /**
     * Comportamento ConnettibileWiFi: Rappresenta la capacità di un apparecchio di connettersi a internet.
     * Richiede l'implementazione di un metodo connetti(String reteWifi).
     * Attenzione: Non tutti i dispositivi di casa hanno il WiFi (alcuni sono semplici e non smart).
     */



// un metodo astratto
    boolean connettiDispositivo(String rete_wifi, String password) ;






}
