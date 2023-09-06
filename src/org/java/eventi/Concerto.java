package org.java.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {

    // ATTRIBUTI
    private LocalTime ora;
    private BigDecimal prezzo;

    //COSTRUTTORI
    public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, BigDecimal prezzo) throws RuntimeException {
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    // GETTER E SETTER
    public LocalTime getOra() {
        return ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }


    // METODI
    public String getDataOra() {
        return getData().getDayOfMonth() + "-" + getData().getMonth() + "-" + getData().getYear()
                + " alle ore " + getOra();
    }

    public String formattaPrezzo() {
        return prezzo.toString() + "€";
    }

    @Override
    public String toString() {
        return "CONCERTO" +"\n" + "data e ora: " + getDataOra() + '\'' +
                ", titolo: " + getTitolo() +
                ", prezzo:" + formattaPrezzo() +
                '}';
    }
}
