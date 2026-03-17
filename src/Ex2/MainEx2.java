//Scrivere un metodo che accetti un intero N e restituisca una lista ordinata di N interi casuali
// da 0 a 100. Scrivere un secondo metodo che accetti una lista e restituisca una nuova lista composta
// dagli elementi della prima lista seguiti dagli stessi elementi disposti in ordine inverso.
// Scrivere una terza funzione che accetti una lista ed un booleano: se il booleano è true stampa i valori
// in posizioni pari, altrimenti stampa i valori in posizioni dispari.
//Creare un main che utilizzi le tre funzioni. Utilizzare l'interfaccia List e l'implementazione ArrayList.


package Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainEx2 {
    public static void main(String[] args) {
        System.out.println(MainEx2.listaOrdinata(10));

    }

    public static List<Integer> listaOrdinata(int num) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            lista.add(rand.nextInt(101));
        }
        Collections.sort(lista);

        return lista;
    }


}