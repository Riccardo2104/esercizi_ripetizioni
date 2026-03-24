package SmartHome;

import java.util.Objects;

public abstract class  Dispositivo {

    private boolean eAcceso;
    private final String seriale;
    private String nome;
    private String marca;


    // per me questa è l'installazione
    public Dispositivo(String seriale) {
        this.seriale = seriale;
        this.eAcceso = false;
    }

    public Dispositivo(String seriale, String nome, String marca) {
        this.seriale = seriale;
        this.nome = nome;
        this.marca = marca;
        this.eAcceso = false;

    }




    public boolean accendi() {
            return this.eAcceso = true;
        }


    public boolean spegni() {
        if (this.iseAcceso()) {
            this.seteAcceso(false);
            return  !this.iseAcceso();
        }
        return this.iseAcceso();
    }

    public abstract double calcoloConsumoDispositvo();

    // definizione di quando sono uguali due dispostivi
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dispositivo that)) return false;
        return Objects.equals(seriale, that.seriale);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(seriale);
    }

    // getter and setter
    // getter
    public boolean iseAcceso() {
        return eAcceso;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getSeriale() {
        return seriale;
    }



    public void seteAcceso(boolean eAcceso) {
        this.eAcceso = eAcceso;
    }
}
