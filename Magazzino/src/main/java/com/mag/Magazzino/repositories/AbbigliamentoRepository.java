package com.mag.Magazzino.repositories;

import com.mag.Magazzino.data.Abbigliamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AbbigliamentoRepository extends JpaRepository<Abbigliamento,String> {

    Optional<Abbigliamento> searchByCodiceAlfaNumerico(String codiceAlfaNumerico);
}
