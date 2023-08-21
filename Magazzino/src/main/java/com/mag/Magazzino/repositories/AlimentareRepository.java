package com.mag.Magazzino.repositories;

import com.mag.Magazzino.data.Alimentare;
import com.mag.Magazzino.data.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlimentareRepository extends JpaRepository<Alimentare, String> {

    Optional<Alimentare> searchByCodiceAlfaNumerico(String codiceAlfanumerico);
}
