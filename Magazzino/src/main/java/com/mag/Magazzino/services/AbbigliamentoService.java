package com.mag.Magazzino.services;

import com.mag.Magazzino.data.Abbigliamento;
import com.mag.Magazzino.repositories.AbbigliamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AbbigliamentoService {

    @Autowired
    private AbbigliamentoRepository abbigliamentoRepository;

    public void saveAbbigliamento(Abbigliamento abbigliamento) throws Exception{
        try {
            abbigliamentoRepository.save(abbigliamento);
            System.out.println("Salvato");
        }catch(Exception e ){
            e.printStackTrace();
        }
    }

    public Optional<Abbigliamento> searchAbbigliamentoByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Abbigliamento> ab= abbigliamentoRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!ab.isEmpty()){
            return ab;
        }return null;
    }

    public String deleteAbbigliamentoByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Abbigliamento> ab= abbigliamentoRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!ab.isEmpty()){
            abbigliamentoRepository.deleteById(codiceAlfaNumerico);
            return "Elemento trovato ed eliminato";
        }
        return "Elemento non trovato";
    }


}
