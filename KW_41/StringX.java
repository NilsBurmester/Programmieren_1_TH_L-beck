/**
 * ## Verflixtes Zeichenketten formatieren mit `stringX()`
 * 
 * Entwickeln Sie nun bitte eine Methode `stringX()`, die
 * alle 'x' aus einer Zeichenkette entfernt, es sei denn sie stehen am Anfang oder
 * am Ende der Zeichenkette.
 * 
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 * 
 * Hinweise:
 * 
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `replaceAll()`
 * 
 */
class StringX {  

    public static String stringX(String s) { 
        //ersetzung nur sinnvoll, wenn die länge von s größer als 2 ist
        if (s.length() > 2) {
            //string zwischen dem ersten und dem letzten Zeichen herausfinden
            String mid = s.substring(1, s.length() - 1);
            //alle x in mid durch einen leeren string ersetzen mit der "replaceAll()"-methode
            String sWithoutX = mid.replaceAll("x", "");
            //ausgabe von erstem zeichen, mid (ohne x) und dem letztem Zeichen
            return s.substring(0, 1) + sWithoutX + s.substring(s.length() - 1);
        }
        //Rückgabe des eingabeStrings, falls die seine länge kleiner 2 ist 
        return s;
        
    }

    public static void main(String[] args) {
        String result = stringX("xxHix");
        System.out.println(result); // => xHix

        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx
    }
}
