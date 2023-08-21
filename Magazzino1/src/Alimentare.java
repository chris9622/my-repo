import java.util.Date;

public class Alimentare extends Prodotto{

    private Date scadenza;

    private String paeseDiProvenienza;
    public Alimentare(String codice, Date entrata, String descrizione, String azienda, Date scadenza, String paeseDiProvenienza) {
        super(codice, entrata, descrizione, azienda);
        this.scadenza=scadenza;
        this.paeseDiProvenienza=paeseDiProvenienza;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public String getPaeseDiProvenienza() {
        return paeseDiProvenienza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public void setPaeseDiProvenienza(String paeseDiProvenienza) {
        this.paeseDiProvenienza = paeseDiProvenienza;
    }

    @Override
    public String toString() {
        return "Alimentare{" +
                "scadenza=" + scadenza +
                ", paeseDiProvenienza='" + paeseDiProvenienza + '\'' +
                '}';
    }
}
