package esercizi_giorno_sucessivo.SmartHome;

public class TelevisoreSmart extends Dispositivo  implements  ConnettibileWifi{
    private final int consumo = 150;


    public TelevisoreSmart(String seriale) {
        super(seriale);

    }



    @Override
    public double calcoloConsumoDispositvo() {

        return this.consumo;
    }

    // implementarazione interfaccia
    @Override
    public boolean connettiDispositivo(String rete_wifi, String password) {
        // se nome e password corrispondo a quelli nella classe rete allora ti connetti
        ReteWifi rete = new ReteWifi();
        return rete.verificaAuenticazione(rete_wifi, password);
    }

}
