package com.mag.Magazzino.services;


import com.mag.Magazzino.data.Elettronico;
import com.mag.Magazzino.repositories.ElettronicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ElettronicoService {

    @Autowired
    private ElettronicoRepository elettronicoRepository;

    public void saveElettronico(Elettronico elettronico) throws Exception {
        try{
            elettronicoRepository.save(elettronico);
            System.out.println("Salvato");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Optional<Elettronico> searchElettronicoByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Elettronico> al= elettronicoRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!al.isEmpty()){
            return al;

        }return null;
    }

    public String deleteElettronicoByCodiceAlfaNumerico(String codiceAlfaNumerico){
        Optional<Elettronico> ab= elettronicoRepository.searchByCodiceAlfaNumerico(codiceAlfaNumerico);
        if(!ab.isEmpty()){
            elettronicoRepository.deleteById(codiceAlfaNumerico);
            return "Elemento trovato ed eliminato";
        }
        return "Elemento non trovato";
    }


}
