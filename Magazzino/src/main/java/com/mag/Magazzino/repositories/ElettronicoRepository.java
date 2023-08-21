package com.mag.Magazzino.repositories;

import com.mag.Magazzino.data.Alimentare;
import com.mag.Magazzino.data.Elettronico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElettronicoRepository extends JpaRepository<Elettronico,String> {

    Optional<Elettronico> searchByCodiceAlfaNumerico(String codiceAlfanumerico);

}
