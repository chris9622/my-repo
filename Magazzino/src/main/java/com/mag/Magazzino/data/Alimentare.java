package com.mag.Magazzino.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.swing.*;
import java.util.Date;

@Entity
@Table(name = "alimentare")
@Getter
@Setter
@NoArgsConstructor
public class Alimentare extends Prodotto{

    private String dataScadenza;

    private String paeseDiProvenienza;

    public Alimentare(String codiceAlfaNumerico, String dataIngresso, String prodotto, String aziendaProduttrice, String dataScadenza, String paeseDiProvenienza) {
        super(codiceAlfaNumerico, dataIngresso, prodotto, aziendaProduttrice);
        this.dataScadenza=dataScadenza;
        this.paeseDiProvenienza=paeseDiProvenienza;
    }

    @Override
    public String toString() {
        return   "Alimentare{" + super.toString() +
                "dataScadenza='" + dataScadenza + '\'' +
                ", paeseDiProvenienza='" + paeseDiProvenienza + '\'' +
                '}';
    }
}
