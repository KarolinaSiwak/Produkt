package com.example.demo.Produkty;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProduktTest {

    @Test
    void create() {
        int id = 10;
        String tytul = "maslo";
        BigDecimal price = new BigDecimal(100);
        Produkt zmienna = new Produkt(id, tytul, price);

        assertEquals(id, zmienna.getId());
        assertEquals(tytul, zmienna.getTytul());
        assertEquals(price, zmienna.getPrice());


    }

    @Test
    void mathrandom() {
        int i;
        for (i = 0; i < 100; i++) {
        }
        Random mathrandom = new Random();
        int myRandInt = mathrandom.ints(1, 101).findAny().getAsInt();
        System.out.println("Random number between 1 and 100: " + myRandInt);
    }


    @Test
    void mathstream() {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 8);
        List<Integer> collect = infiniteStream
                .limit(100)
                .collect(Collectors.toList());

        assertEquals(collect, Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18));
    }
}



        //IntStream.range(0, 10).parallel().forEach(
                //nbr -> {
                    //try {
                      //  Thread.sleep(100);
                    //} catch (InterruptedException ex) {
                    //}

                    //System.out.println(nbr);};}

