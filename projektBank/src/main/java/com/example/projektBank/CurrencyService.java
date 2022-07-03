package com.example.projektBank;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {

    final CurrencyRepo currencyRepo;
    final RestTemplate restTemplate;



    public CurrencyService(CurrencyRepo currencyRepo, RestTemplate restTemplate) {
        this.currencyRepo = currencyRepo;
        this.restTemplate = restTemplate;
    }

    public CurrencyEntity getCurrency(String st_date, String nd_date){
        CurrencyEntity result = restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/"
                +st_date+"/"+nd_date+"/", CurrencyEntity.class).getBody();


        return currencyRepo.save(result);

    }
}
