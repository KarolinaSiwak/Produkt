package com.example.demo.Produkty;

import java.math.BigDecimal;

public class Produkt {


    private int id;

    private String tytul;

    private BigDecimal price;

    public Produkt(int id, String tytul, BigDecimal cena) {

        price = cena;
        this.id = id;
        this.tytul = tytul;
    }
    public int getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
