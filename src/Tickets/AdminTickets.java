package Tickets;


public class AdminTickets {
    private int plataforma;
    private int Cajas;
    private int Preferencial;

    public AdminTickets(int plataforma, int Cajas, int Preferencial) {
        this.plataforma = plataforma;
        this.Cajas = Cajas;
        this.Preferencial = Preferencial;
    }
    
    public int getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(int plataforma) {
        this.plataforma = plataforma;
    }

    public int getCajas() {
        return Cajas;
    }

    public void setCajas(int Cajas) {
        this.Cajas = Cajas;
    }

    public int getPreferencial() {
        return Preferencial;
    }

    public void setPreferencial(int Preferencial) {
        this.Preferencial = Preferencial;
    }
    
}
