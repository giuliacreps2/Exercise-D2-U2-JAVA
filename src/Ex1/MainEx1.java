//Esercizio #1
//Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti
// il numero di elementi da inserire e poi gli chieda di inserire N parole.
// Il programma dovrà:
//– stampare tutte le parole duplicate
//– stampare il numero di parole distinte
//– stampare l'elenco delle parole distinte
//Utilizzare l'interfaccia Set e l'implementazione HashSet

package Ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array con il set
        Set<String> paroleUniche = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        //Indicazioni all'utente
        System.out.println("Inserisci un numero intero che rappresenti il numero di elementi che vuoi inserire nella tua lista della spesa. Clicca 0 se vuoi finire");
        int num = Integer.parseInt(scanner.nextLine());
        //TODO: Controlli

        for (int i = 0; i < num; i++) {
            System.out.println("Dammi una parola");
            String str = scanner.nextLine();
            if (!paroleUniche.add(str)) paroleDuplicate.add(str);
        }

        System.out.println(paroleUniche);
        System.out.println(paroleDuplicate);
    }


}

