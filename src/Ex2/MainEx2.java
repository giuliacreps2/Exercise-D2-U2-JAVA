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
        int num = 10;
        List<Integer> lista1 = listaOrdinata(10);
        System.out.println(lista1);

        List<Integer> lista2 = listaOrdinata2(lista1);
        System.out.println(lista2);

//        List<Integer> lista3 = listaPariDispari(lista2);
//        System.out.println(lista3);

        System.out.println("Posizioni pari: ");
        listaPariDispari(lista2, true);

    }

//Scrivere un metodo che accetti un intero N e restituisca una lista ordinata di N interi casuali
// da 0 a 100.

    //List<Integer> è quello che torna il metodo
    public static List<Integer> listaOrdinata(int num) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            lista.add(rand.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    //Scrivere un secondo metodo che accetti una lista e restituisca una nuova lista composta
    //dagli elementi della prima lista seguiti dagli stessi elementi disposti in ordine inverso.

    public static List<Integer> listaOrdinata2(List<Integer> numeri) {
        List<Integer> lista2 = new ArrayList<>(numeri);

        List<Integer> inversa = new ArrayList<>(numeri);
        Collections.reverse(inversa);

        lista2.addAll(inversa);
        return lista2;
    }

    //Scrivere una terza funzione che accetti una lista ed un booleano: se il booleano è true stampa i valori
    //in posizioni pari, altrimenti stampa i valori in posizioni dispari.

//    public static List<Integer> listaPariDispari(List<Integer> lista2) {
//        ArrayList<Integer> lista3 = new ArrayList<>(lista2);
//        for (int i = 0; i < lista3.size(); i += 2) {
//            Integer elementoPari = lista3.get(i);
//            System.out.println("Indice pari " + i + ": " + elementoPari);
//        }
//        return lista3;
//    }

    public static void listaPariDispari(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari) {
                if (i % 2 == 0) System.out.println(lista.get(i) + " ");
            } else {
                if (i % 2 != 0) System.out.println(lista.get(i) + " ");
            }
        }
    }
}
