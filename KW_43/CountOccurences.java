/**
 * ## Vorkommen von Zeichenketten zählen
 * 
 * Schreiben Sie nun eine Methode `countOccurences()` die zählt, wie häufig eine Zeichenkette *a* in einer 
 * anderen Zeichenkette *b* vorkommt. Sich überlagernde Zeichenketten sind erlaubt. 
 * D.h. "xx" ist als zweimal in "xxx" vorhanden zu zählen.
 * Leere Zeichenketten sind nicht zu zählen.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Beachten Sie, dass leere Zeichenketten schnell eine Endlosschleife erzeugen können.
 * - Liefert VPL eine Out-of-Memory Fehlermeldung ist dies vermutlich auf eine 
 *   Endlosschleife zurückzuführen.
 * - Die String-Methoden `indexOf()` oder `startsWith()` könnten hilfreich sein.
 * 
 */
class CountOccurences {

    public static int countOccurences(String a, String b) {
        //aggregatvariable für die Lösung
        int occurences = 0; 
        //wenn a leer ist ("") wird die unveränderte aggregatvariable ausgegeben, weil nichts hochgezählt werden kann
        if ( a.isEmpty()) {
            return occurences;
        }
        // loop über den parameter b
        for (int i = 0; i < b.length(); i++) {
            //prüfen, ob der substring ab dem aktuellen index i mit dem string a beginnt
            if (b.substring(i).startsWith(a)) {
                //ist dies der Fall, zähle aggregatvariable um einen hoch
                occurences++;
            }
        
        }
        //ausgabe der Lösung
        return occurences;
    }

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2
    }
}