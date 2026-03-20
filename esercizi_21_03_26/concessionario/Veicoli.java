import java.time.Year;

public abstract class Veicoli {
    protected String nome_veicolo;
    protected int prezzo_base;
    protected Year anno_immatricolazione ;
    protected int costo_assicurazione;
    protected String tipo_veicolo;


    // metodi

    public abstract int getPrezzo();
    public abstract int calcolo_anni();
    public abstract int costo_assicurazione();





}
