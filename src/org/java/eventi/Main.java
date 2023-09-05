package org.java.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //si chiede all’utente di inserire un nuovo evento con tutti i parametri.
        System.out.println("---- BENVENUTO NEL NOSTRO SISTEMA DI PRENOTAZIONE DI EVENTI ----");
        System.out.println("Inserisci un nuovo evento: ");
        System.out.print("TITOLO ");
        String titolo = scan.nextLine();
        System.out.print("DATA ");
        LocalDate data = LocalDate.parse(scan.nextLine());
        System.out.print("POSTI DISPONIBILI ");
        int postiDisponibili = Integer.parseInt(scan.nextLine());

        Evento evento = new Evento( titolo, data, postiDisponibili);
        System.out.println(evento.toString());
        //  chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle

        // Stampare a video il numero di posti prenotati e quelli disponibili

        //Chiedere all’utente se e quanti posti vuole disdire

        // Provare ad effettuare le disdette

        // Stampare a video il numero di posti prenotati e quelli disponibili


    }
}
