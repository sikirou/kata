package com.kata.EFTS;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class ProduitsTest {


    private int getNbDistinctDate(List<Price> prices) {
        Integer nbDistinctDate = 0;
        Map<Date, Integer> nbByDate = new HashMap<>();
        Set<Date> dateSet = new HashSet<>();
        for (Price price : prices) {
            if (price.isOfficial()) {
                Integer value = nbByDate.get(price.getDate());
                if (value == null) {
                    nbByDate.put(price.getDate(), 1);
                } else {
                    nbByDate.put(price.getDate(), ++value);
                }
            }
            if (nbByDate.get(price.getDate()) == 2) {
                nbDistinctDate++;
            }
        }
        return nbDistinctDate;
    }

    @Test
    public void nbDistincDateShouldBe3() {
        LocalDateTime today = LocalDateTime.now();     //Today
        LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day

        List<Price> priceList = Arrays.asList(
                new Price(Date.from(today.atZone(ZoneId.systemDefault()).toInstant()), 1, true, 12.0),
                new Price(Date.from(today.atZone(ZoneId.systemDefault()).toInstant()), 2, true, 10.0),
                new Price(Date.from(today.atZone(ZoneId.systemDefault()).toInstant()), 14, true, 10.0),
                new Price(Date.from(tomorrow.atZone(ZoneId.systemDefault()).toInstant()), 3, true, 1.0),
                new Price(Date.from(yesterday.atZone(ZoneId.systemDefault()).toInstant()), 4, true, 15.0),
                new Price(Date.from(yesterday.atZone(ZoneId.systemDefault()).toInstant()), 5, true, 13.0),
                new Price(Date.from(tomorrow.atZone(ZoneId.systemDefault()).toInstant()), 6, false, 14.0),
                new Price(Date.from(yesterday.atZone(ZoneId.systemDefault()).toInstant()), 7, true, 11.0),
                new Price(Date.from(tomorrow.atZone(ZoneId.systemDefault()).toInstant()), 8, true, 4.0),
                new Price(Date.from(yesterday.atZone(ZoneId.systemDefault()).toInstant()), 9, true, 7.0),
                new Price(Date.from(tomorrow.atZone(ZoneId.systemDefault()).toInstant()), 10, true, 9.0)
        );

        assertEquals(3, getNbDistinctDate(priceList));
    }

    @Test
    public void nbDistinctDateShouldBe0() {
        LocalDateTime today = LocalDateTime.now();     //Today
        List<Price> priceList = Arrays.asList(
                new Price(Date.from(today.atZone(ZoneId.systemDefault()).toInstant()), 1, true, 12.0),
                new Price(Date.from(today.atZone(ZoneId.systemDefault()).toInstant()), 2, true, 10.0));
        assertEquals(0, getNbDistinctDate(new ArrayList<Price>()));
    }

    class Price {
        private Date date;
        private int produitId;
        private boolean official;
        private double price;

        public Price(Date date, int produitId, boolean official, double price) {
            this.date = date;
            this.produitId = produitId;
            this.official = official;
            this.price = price;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getProduitId() {
            return produitId;
        }

        public void setProduitId(int produitId) {
            this.produitId = produitId;
        }

        public boolean isOfficial() {
            return official;
        }

        public void setOfficial(boolean official) {
            this.official = official;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
