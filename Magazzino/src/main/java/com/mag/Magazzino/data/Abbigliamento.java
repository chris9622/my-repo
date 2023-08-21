package com.mag.Magazzino.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "abbigliamento")
@Getter
@Setter
@NoArgsConstructor
public class Abbigliamento extends Prodotto{

    private String modello;

    private String sesso;

    private String materiale;

    private String taglia;

    public Abbigliamento(String codiceAlfaNumerico,String dataIngresso, String prodotto, String aziendaProduttrice, String modello, String sesso, String materiale, String taglia) {
        super(codiceAlfaNumerico, dataIngresso, prodotto, aziendaProduttrice);
        this.modello=modello;
        this.sesso=sesso;
        this.materiale=materiale;
        this.taglia=taglia;

    }

    @Override
    public String toString() {
        return "Abbigliamento{" + super.toString() +
                "modello='" + modello + '\'' +
                ", sesso='" + sesso + '\'' +
                ", materiale='" + materiale + '\'' +
                ", taglia='" + taglia + '\'' +
                '}';
    }
}
