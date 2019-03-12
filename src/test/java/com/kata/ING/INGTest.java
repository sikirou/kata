package com.kata.ING;

import org.junit.Before;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


public class INGTest {

    Comparator<Transaction> comparator = Comparator.reverseOrder();
    private INGTest ingTest;

    @Before
    public void init() {
        ingTest = new INGTest();
    }

    private List<Transaction> getTransaction() {
        return  Arrays.asList(
                new Transaction(new Trader("abdoul", "paris"), 15, 2019),
                new Transaction(new Trader("madou", "Evry"), 20, 2019),
                new Transaction(new Trader("abdoul", "paris"), 300, 2017),
                new Transaction(new Trader("georges", "DEF"), 79, 2019),
                new Transaction(new Trader("Michel", "paris"), 100, 2018),
                new Transaction(new Trader("Jean", "Evry"), 85, 2019),
                new Transaction(new Trader("Abdoul", "paris"), 70, 2016),
                new Transaction(new Trader("Jules", "paris"), 96, 2017));
    }

    private List<Transaction> listeTransactionByYear(int year) {
        return ingTest.getTransaction().stream().filter(transaction -> transaction.getAnnee() == year).collect(Collectors.toList());
    }

    private List<Transaction> findTransactionBYYearOrderByAmount(int year) {
        return listeTransactionByYear(year).stream().sorted(comparator).collect(Collectors.toList());
    }

    @Test
    public void transactionIn2019ShouldBeFour() {
        assertEquals(4,listeTransactionByYear(2019).size());
        assertEquals("[Trader : nom :abdoul , ville : paris , annee : 2 019, montant :15, Trader : nom :madou , ville : Evry , annee : 2 019, montant :20, Trader : nom :georges , ville : DEF , annee : 2 019, montant :79, Trader : nom :Jean , ville : Evry , annee : 2 019, montant :85]", listeTransactionByYear(2019).toString());
    }

    @Test
    public void transactionIN2019ShouldBeSortedByAmount() {
        assertEquals(4,findTransactionBYYearOrderByAmount(2019).size());
        assertEquals("[Trader : nom :Jean , ville : Evry , annee : 2 019, montant :85, Trader : nom :georges , ville : DEF , annee : 2 019, montant :79, Trader : nom :madou , ville : Evry , annee : 2 019, montant :20, Trader : nom :abdoul , ville : paris , annee : 2 019, montant :15]", findTransactionBYYearOrderByAmount(2019).toString());
    }

    class Trader implements Comparable {
        String nom;
        String ville;

        public Trader(String nom, String ville) {
            this.nom = nom;
            this.ville = ville;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        @Override
        public String toString() {
            return MessageFormat.format("nom :{0} , ville : {1} ", nom, ville);
        }

        @Override
        public int compareTo(Object o) {
            return getNom().compareTo(((Trader) o).getNom());
        }
    }

    class Transaction implements Comparable {
        Trader trader;
        double montant;
        int annee;

        public Transaction(Trader trader, double montant, int annee) {
            this.trader = trader;
            this.montant = montant;
            this.annee = annee;
        }

        public Trader getTrader() {
            return trader;
        }

        public void setTrader(Trader trader) {
            this.trader = trader;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double montant) {
            this.montant = montant;
        }

        public int getAnnee() {
            return annee;
        }

        public void setAnnee(int annee) {
            this.annee = annee;
        }

        @Override
        public String toString() {
            return MessageFormat.format("Trader : {0}, annee : {1}, montant :{2}", trader, annee, montant);
        }


        @Override
        public int compareTo(Object o) {

            Transaction transaction2 = (Transaction) o;
            int compare = Double.compare(getMontant(), transaction2.getMontant());
            return compare != 0 ? compare : getTrader().getNom().compareTo(transaction2.getTrader().getNom());
        }
    }

}
