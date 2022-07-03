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

    @GetMapping("/{st_date}/{nd_date}/show")
    public CurrencyEntity all(@PathVariable String st_date, @PathVariable String nd_date){

        return currencyService.getCurrency(st_date, nd_date);

    }


}
