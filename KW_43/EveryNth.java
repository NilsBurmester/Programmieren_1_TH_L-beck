/**
 * ## Zeichenketten verarbeiten mit `everyNth()`
 * 
 * Entwickeln Sie nun bitte eine Methode `everyNth()`, die für eine Zeichenkette $s$
 * nur jedes n.te Zeichen zurück liefert. 
 * Bei $n = 3$ sollen also nur die Zeichen 0, 3, 6, ... und so weiter zurückgegeben werden.
 * Fuer $n <= 0$ soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()-Methode`.
 * 
 * __Hinweis:__
 * 
 * - Achtung: Diese Aufgabe ist anfällig für Endlosschleifen.
 * - Erhalten Sie in VPL eine Out-of-Memory oder "getötet"-Fehlermeldung, 
 *   haben Sie vermutlich eine Endlosschleife gebaut.
 * 
 */
class EveryNth {

    public static String everyNth(String s, int n) {
        //ist n <= 0, wird leere zeichenkette zurückgegeben
        if (n <= 0) {
            return "";
        }
        //Erstellung der aggregatvariable, wo die lösung gespeichert wird
        String solution = "";
        //ermittlung der länge von s
        int length = s.length(); 
        //mittels for-loop jeden index in s prüfen, ob er ein vielfaches von n ist
        for (int i = 0; i < length; i++) {
            if (i % n == 0) {
                //ist der index i ein vielfaches von n, füge den buchstaben mit diesem index der aggregatvariable hinzu
                solution += s.substring(i,i + 1);
            }
        }
        //ausgabe der Lösung
        return solution;
    }

    public static void main(String[] args) {
        String result = everyNth("Miracle", 2);
        System.out.println(result); // => "Mrce"
        result = everyNth("Miracle", 0);
        System.out.println(result); // => ""
        System.out.println(everyNth("abcdefg", 2)); // => "aceg"
        System.out.println(everyNth("abcdefg", 3)); // => "adg"
    }
}