package com.mag.Magazzino.data;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public  abstract class Prodotto {
    @Id
    private String codiceAlfaNumerico;

    private String dataIngresso;

    private String prodotto;

    private String aziendaProduttrice;

    @Override
    public String toString() {
        return  "codiceAlfaNumerico='" + codiceAlfaNumerico + '\'' +
                ", dataIngresso='" + dataIngresso + '\'' +
                ", prodotto='" + prodotto + '\'' +
                ", aziendaProduttrice=' , " + aziendaProduttrice + '\'';
    }
}
