/**
 * ## Zeichenketten formatieren mit `endUp()`
 * 
 * Schreiben Sie eine Methode `endUp()`, die die letzten
 * drei Zeichen einer Zeichenkette groß schreibt.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()` 
 * - `toUpperCase()`
 * - `length()`
 * - Der Einsatz der Kontrollanweisung `if` kann hilfreich sein.
 * 
 */
class EndUp {

    public static String endUp(String s) {
        //länge von s finden
        int length = s.length();
        //für den fall, dass Zeichenkette weniger als 3 zeichen hat, wird eine guard-klausel genutzt, die dies am anfang prüft 
        //und den ganzen String in upper case ausgibt
        if (length < 3) return s.toUpperCase();
        //ersten teil des ergebnisstrings finden
        String begin = s.substring(0, length - 3);
        //letzte 3 zeichen von s in uppercase umwandeln
        String end = s.substring(length - 3).toUpperCase();
        //ersten und zweiten teil zurückgeben
        return begin + end;
    }

    public static void main(String[] args) {
        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"
    }
}
