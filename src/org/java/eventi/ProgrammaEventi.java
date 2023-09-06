package org.java.eventi;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProgrammaEventi {
    /*
    Creare una classe ProgrammEventi con i seguenti attributi
● titolo: String
● eventi: List<Evento>
Nel costruttore valorizzare il titolo, passato come parametro, e inizializzare la
lista di eventi come una nuova ArrayList
     */

    // ATTRIBUTI
    private String titolo;
    private ArrayList<Evento> eventi;

    // COSTRUTTORI
public ProgrammaEventi(String titolo){
    this.titolo=titolo;
    eventi = new ArrayList<Evento>();
}

    // GETTER E SETTER


    // METODI
    /*
    Aggiungere i seguenti metodi :
● un metodo che aggiunge alla lista un Evento, passato come parametro
● un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
● un metodo che restituisce quanti eventi sono presenti nel programma
● un metodo che svuota la lista di eventi
● un metodo che restituisce una stringa che mostra il titolo del programma e tutti gli eventi
     */

    public void aggiungiEvento(Evento evento){
        eventi.add(evento);
    }

    public void trovaEventoPerData(LocalDate dataScelta){
        for (int i = 0; i<eventi.size(); i++) {
            if (eventi.get(i).getData() == dataScelta) {
                System.out.println(eventi.get(i));
            }
        }
    }
}
