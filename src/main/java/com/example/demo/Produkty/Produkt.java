package com.example.demo.Produkty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
    public List<BigDecimal> getPrices(List<Produkt> lista){
        List<BigDecimal> prices = new ArrayList<>();
        for (int i = 0; i < lista.size() ; i++){
            Produkt produkt = lista.get(i);
            BigDecimal price1 = produkt.getPrice();
            prices.add(price1);
        }
        return prices;
    }
}
