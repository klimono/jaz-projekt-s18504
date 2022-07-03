package com.example.projektBank;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CurrencyRest {

    final CurrencyService currencyService;

    public CurrencyRest(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/cena")
    public String zloto(){
        return currencyService.ceny_zlota();
    }
    @GetMapping("/{st_date}/{nd_date}/show")
    public CurrencyEntity waluty(@PathVariable String st_date, @PathVariable String nd_date){

        return currencyService.make(st_date, nd_date);

    }


}
