package com.example.projektBank;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CurrencyService {

    final CurrencyRepo currencyRepo;
    final RestTemplate restTemplate;



    public CurrencyService(CurrencyRepo currencyRepo, RestTemplate restTemplate) {
        this.currencyRepo = currencyRepo;
        this.restTemplate = restTemplate;
    }

    public String ceny_zlota(){
        String cena = restTemplate.getForEntity("https://api.nbp.pl/api/cenyzlota/", String.class).getBody();

        return cena;
    }

    public CurrencyEntity make(String st_date, String nd_date){
        CurrencyEntity result = restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/"
                +st_date+"/"+nd_date+"/", CurrencyEntity.class).getBody();

        return currencyRepo.save(result);
    }


}
