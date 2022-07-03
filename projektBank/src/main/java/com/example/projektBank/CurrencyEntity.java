package com.example.projektBank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
public class CurrencyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String wszystko;




    public CurrencyEntity(String wszystko) {
        this.wszystko = wszystko;
    }


}
