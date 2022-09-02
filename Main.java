package org.example;

import javax.naming.PartialResultException;
import javax.net.ssl.SNIHostName;
import java.util.*;

public class Main {

    public  static  void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         boolean shouldContinue = true;

          Party party = new Party();

         while (shouldContinue) {
             System.out.println("Wybierz opcję");
             System.out.println("1. Wyświetl gości");
             System.out.println("2. Wybierz opcję");
             System.out.println("3. Wyświetl potrawy");
             System.out.println("4. Znajdź po numerze telefonu");
             System.out.println("5. Wyjście");

             int userChoice =  scanner.nextInt();

             switch (userChoice) {m
                 case 1 -> party.displayGuests();
                 case 2->  party.addGuest();
                 case 3 -> party.displayMeals();
                 case 4 -> party.displayGuestByPhoneNumber();
                 case 5 -> shouldContinue = false;



             }
         }


    }
}






