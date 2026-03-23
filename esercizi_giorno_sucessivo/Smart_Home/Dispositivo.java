package Smart_Home;

public abstract class  Dispositivo {

    private boolean eAcceso;
    final String seriale;

    public Dispositivo(String seriale, boolean eAcceso) {
        this.seriale = seriale;
        this.eAcceso = eAcceso;
    }

    public boolean accendi() {
        if (!this.iseAcceso()) {
            this.seteAcceso(true);
            return  this.iseAcceso();
        }
        return  this.iseAcceso();
    }

    public boolean spegni() {
        if (this.iseAcceso()) {
            this.seteAcceso(false);
            return  !this.iseAcceso();
        }
        return this.iseAcceso();
    }

    public abstract double calcoloConsumoDispositvo();

    // getter and setter

    public boolean iseAcceso() {
        return eAcceso;
    }

    public void seteAcceso(boolean eAcceso) {
        this.eAcceso = eAcceso;
    }
}
