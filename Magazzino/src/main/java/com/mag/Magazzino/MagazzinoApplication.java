package com.mag.Magazzino;

import com.mag.Magazzino.data.Abbigliamento;
import com.mag.Magazzino.data.Alimentare;
import com.mag.Magazzino.data.Elettronico;
import com.mag.Magazzino.services.AbbigliamentoService;
import com.mag.Magazzino.services.AlimentareService;
import com.mag.Magazzino.services.ElettronicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagazzinoApplication implements CommandLineRunner {

	@Autowired
	private ElettronicoService elettronicoService;

	@Autowired
	private AbbigliamentoService abbigliamentoService;

	@Autowired
	private AlimentareService alimentareService;

	public static void main(String[] args) {
		SpringApplication.run(MagazzinoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     	elettronicoService.saveElettronico(new Elettronico("E001","02/03/2021","televisore","Samsung","C"));
		elettronicoService.saveElettronico(new Elettronico("E002","02/03/2023","frigo","Lg","A"));
		elettronicoService.saveElettronico(new Elettronico("E003","02/03/2022","forno","Ariston","B"));
		abbigliamentoService.saveAbbigliamento(new Abbigliamento("V004","13/12/2019","maglione","Diesel","girocollo","m","cotone","m"));
		abbigliamentoService.saveAbbigliamento(new Abbigliamento("V005","17/12/2019","abito","Guess","talleur","f","cotone","s"));
		abbigliamentoService.saveAbbigliamento(new Abbigliamento("V006","11/12/2019","jeans","Levis","slim","m","cotone","l"));
		alimentareService.saveAlimentare(new Alimentare("A007","22/12/2022","pollo","Amadori","22/12/2023","Italia"));
		alimentareService.saveAlimentare(new Alimentare("A008","22/06/2023","burro","Barilla","22/07/2023","Italia"));
		alimentareService.saveAlimentare(new Alimentare("A009","29/07/2023","pasta","Molisana","22/12/2024","Italia"));
		System.out.println(alimentareService.searchAlimentareByCodiceAlfaNumerico("A007"));
		System.out.println(elettronicoService.searchElettronicoByCodiceAlfaNumerico("E001"));
		System.out.println(abbigliamentoService.searchAbbigliamentoByCodiceAlfaNumerico("V004"));
		System.out.println(abbigliamentoService.deleteAbbigliamentoByCodiceAlfaNumerico("V06"));
		System.out.println(alimentareService.deleteAlimentareByCodiceAlfaNumerico("A007"));
		System.out.println(elettronicoService.deleteElettronicoByCodiceAlfaNumerico("e"));


	}
}
