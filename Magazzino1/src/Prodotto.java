import java.util.Date;

public class Prodotto {
    private String codice;
    private Date entrata;

    private String descrizione;

    private String azienda;

    public Prodotto(String codice, Date entrata, String descrizione, String azienda) {
        this.codice = codice;
        this.entrata = entrata;
        this.descrizione = descrizione;
        this.azienda = azienda;
    }

    public String getCodice() {
        return codice;
    }

    public Date getEntrata() {
        return entrata;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setEntrata(Date entrata) {
        this.entrata = entrata;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                ", entrata=" + entrata +
                ", descrizione='" + descrizione + '\'' +
                ", azienda='" + azienda + '\'' +
                '}';
    }
}
