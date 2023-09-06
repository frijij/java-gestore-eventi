package org.java.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isValid= false;

        while (!isValid) {
            //si chiede all’utente di inserire un nuovo evento con tutti i parametri.
            System.out.println("---- BENVENUTO NEL NOSTRO SISTEMA DI PRENOTAZIONE DI EVENTI ----");
            System.out.println("Inserisci un nuovo evento: ");
            System.out.print("TITOLO ");
            String titolo = scan.nextLine();
            System.out.print("DATA ");
            LocalDate data = LocalDate.parse(scan.nextLine());
            System.out.print("POSTI DISPONIBILI ");
            int postiTotali = Integer.parseInt(scan.nextLine());

            try{
                Evento evento = new Evento( titolo, data, postiTotali);
                isValid=true;
                System.out.println(evento.toString());
                boolean exit = false;
                while (!exit) {
                    System.out.println();
                    System.out.println("Cosa vuoi fare? (1-prenotare; 2-disdire; 3-uscire)");
                    int scelta = Integer.parseInt(scan.nextLine());
                    switch(scelta){
                        case 1:
                            System.out.print("Quante prenotazioni desideri effettuare? ");
                            int prenotazioniRichieste = Integer.parseInt(scan.nextLine());
                            evento.prenota(prenotazioniRichieste);
                            System.out.println("Posti prenotati per questo evento: " + evento.getPostiPrenotati());
                            System.out.println("Posti disponibili per questo evento: " + evento.postiDisponibili(evento.getPostiTotali(), evento.getPostiPrenotati()));
                            break;
                        case 2:
                            System.out.print("Quante prenotazioni vuoi disdire?");
                            int disdetteRichieste = Integer.parseInt(scan.nextLine());
                            evento.disdici(disdetteRichieste);
                            System.out.println("Posti prenotati per questo evento: " + evento.getPostiPrenotati());
                            System.out.println("Posti disponibili per questo evento: " + evento.postiDisponibili(evento.getPostiTotali(), evento.getPostiPrenotati()));
                            break;
                        case 3:
                            exit= true;
                            System.out.println("A presto!");
                            break;
                        default:
                            System.out.println("Scelta non valida.");
                            break;
                    }
                }

            } catch (RuntimeException e){
                System.out.println("Errore nella compilazione dei campi.");
            }
        }
    }
}
