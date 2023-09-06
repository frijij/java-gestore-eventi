package org.java.eventi;

import java.time.LocalDate;

public class Evento {
    // ATTRIBUTI
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;

    // COSTRUTTORI

    public Evento(String titolo, LocalDate data, int postiTotali) throws RuntimeException{
        this.titolo= titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        postiPrenotati = 0;
        isValidPostiTotali(postiTotali);
        isValidData(data);
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

    private boolean isValidData(LocalDate data){
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException();
        }
        return true;
    }

    private boolean isValidPostiTotali(int postiTotali){
        if(postiTotali<=0){
            throw new RuntimeException();
        }
        return true;
    }
    private boolean isValidPostiPrenotati(int postiPrenotati){
            if(postiPrenotati<=0){
                throw new RuntimeException();
            }
            return true;
    }
    public int postiDisponibili(int postiTotali, int postiPrenotati){
        int postiDisponibili = postiTotali - postiPrenotati;
        return postiDisponibili;
    }

    private boolean isValidPostiDisponibili(int postiTotali, int postiPrenotati){
        if (postiDisponibili(postiTotali,postiPrenotati)<=0){
            throw new RuntimeException();
        }
        return true;
    }

    public void prenota(int prenotazioniRichieste) throws IllegalArgumentException{
       // isValidPostiDisponibili(postiTotali, postiPrenotati);
        isValidData(data);
        if (prenotazioniRichieste>postiDisponibili(postiTotali, postiPrenotati)){
            throw new IllegalArgumentException("Posti disponibili insufficienti.");
        }
           postiPrenotati += prenotazioniRichieste;
    }

    public void disdici(int disdetteRichieste) {
            isValidPostiPrenotati(postiPrenotati);
            if(disdetteRichieste>postiPrenotati){
                throw new IllegalArgumentException("Il numeor dei posti da disdire non può essere maggiore dei posti prenotati.");
            }
            postiPrenotati-=disdetteRichieste;
    }

    @Override
    public String toString() {
        return "Evento: " +
                "data: " + data.getDayOfMonth() + "-" + data.getMonth() + "-" + data.getYear() + '\'' +
                ", titolo: " + titolo + ".";
    }
}


