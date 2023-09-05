package org.java.eventi;

import java.time.LocalDate;

public class Evento {
    // ATTRIBUTI
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;

    // COSTRUTTORI

    public Evento(String titolo, LocalDate data, int postiTotali){
        this.titolo= titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        postiPrenotati = 0;
    }


    // GETTER E SETTER

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public int getPostiTotali(){
        return postiTotali;
    }

    public int getPostiPrenotati(){
        return postiPrenotati;
    }


    // METODI
    /*
    Inserire il controllo che la data non sia già passata e che il numero di posti totali sia positivo.
    In caso contrario sollevare opportune eccezioni.
     */

    // PRENOTA: aggiunge un certo numero di posti prenotati.
    // Se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione.


    //DISDICI: riduce di un certo numero i posti prenotati.
    // Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.


    // OVERRIDE DI toString(): stringa contenente: data formattata - titolo
}


