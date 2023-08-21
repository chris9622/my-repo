package com.mag.Magazzino.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "elettronico")
@Getter
@Setter
@NoArgsConstructor


public class Elettronico extends Prodotto{
    private String classeEnergetica;

    public Elettronico(String codiceAlfaNumerico, String dataIngresso, String prodotto, String aziendaProduttrice,String classeEnergetica) {
        super(codiceAlfaNumerico, dataIngresso, prodotto, aziendaProduttrice);
        this.classeEnergetica=classeEnergetica;
    }

    @Override
    public String toString() {
        return "Elettronico{" + super.toString() +
                "classeEnergetica='" + classeEnergetica + '\'' +
                '}';
    }
}
