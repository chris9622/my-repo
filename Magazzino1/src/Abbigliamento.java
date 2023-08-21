import java.util.Date;

public class Abbigliamento extends Prodotto{

    private String modello;

    private String sesso;

    private String materiale;

    private int taglia;

    public Abbigliamento(String codice, Date entrata, String descrizione, String azienda,String modello, String sesso, String materiale, int taglia) {
        super(codice, entrata, descrizione, azienda);
        this.modello=modello;
        this.sesso=sesso;
        this.materiale=materiale;
        this.taglia=taglia;
    }

    public String getModello() {
        return modello;
    }

    public String getSesso() {
        return sesso;
    }

    public String getMateriale() {
        return materiale;
    }

    public int getTaglia() {
        return taglia;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public void setTaglia(int taglia) {
        this.taglia = taglia;
    }

    @Override
    public String toString() {
        return "Abbigliamento{" +
                "modello='" + modello + '\'' +
                ", sesso='" + sesso + '\'' +
                ", materiale='" + materiale + '\'' +
                ", taglia=" + taglia +
                '}';
    }
}
