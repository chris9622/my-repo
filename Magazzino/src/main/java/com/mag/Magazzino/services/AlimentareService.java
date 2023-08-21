package com.mag.Magazzino.services;

import com.mag.Magazzino.data.Alimentare;
import com.mag.Magazzino.repositories.AlimentareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlimentareService {

    @Autowired
    private AlimentareRepository alimentareRepository;

    public void saveAlimentare(Alimentare alimentare){
        try{
            alimentareRepository.save(alimentare);
            System.out.println("Salvato");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Optional<Alimentare> searchAlimentareByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Alimentare> al= alimentareRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!al.isEmpty()){
            return al;

        }return null;
    }

    public String deleteAlimentareByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Alimentare> ab=alimentareRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!ab.isEmpty()){
           alimentareRepository.deleteById(codiceAlfaNumerico);
            return "Elemento trovato ed eliminato";
        }
        return "Elemento non trovato";
    }






}
