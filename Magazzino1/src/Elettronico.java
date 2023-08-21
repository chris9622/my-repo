import java.util.Date;

public class Elettronico extends Prodotto{

    private String classeEnergetica;
    public Elettronico(String codice, Date entrata, String descrizione, String azienda, String classeEnergetica) {
        super(codice, entrata, descrizione, azienda);
        this.classeEnergetica=classeEnergetica;
    }

    public String getClasseEnergetica() {
        return classeEnergetica;
    }
    public void setClasseEnergetica(String classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    @Override
    public String toString() {
        return "Elettronico{" +
                "classeEnergetica='" + classeEnergetica + '\'' +
                '}';
    }
}
