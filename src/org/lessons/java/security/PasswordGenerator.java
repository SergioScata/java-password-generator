package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String usersname = scan.next();
        System.out.println("Inserisci il tuo cognome");
        String userssurname = scan.next();
        System.out.println("Inserisci il tuo colore preferito");
        String userscolor = scan.next();
        System.out.println("Inserisci il tuo giorno di nascita");
        int birthday = scan.nextInt();
        System.out.println("Inserisci il tuo mese di nascita");
        int birthmonth = scan.nextInt();
        System.out.println("Inserisci il tuo anno di nascita");
        int birthyear = scan.nextInt();

        int birthdatessum = birthday + birthmonth + birthyear;

        System.out.println("La tua nuova password è: " + usersname + "-" + userssurname + "-" + userscolor + "-" + birthdatessum);

    }
}
