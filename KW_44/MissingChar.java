/**
 * ## `missingChar()``
 * 
 * Entwickeln Sie bitte eine Methode `missingChar()`, die aus einer
 * Zeichenkette eine neue Zeichenkette erzeugt, in der das n-te Zeichen fehlt.
 * 
 * 
 * __Achtung:__
 * Der Wert von *n* muss nicht in der ursprünglichen Zeichenkette liegen.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * Challenge: Versuchen Sie diese Aufgabe ohne Schleifen zu lösen.
 *   
 */
class MissingChar {

    public static String missingChar(String s, int i) {
        //letzten Index ermitteln für guard-klausel
        int lastIndex = s.length() - 1; 
        //guard-klausel: wenn parameter i kleiner 0 oder größer als der letzte index von s ist, gib s aus(weil es keinen buchstaben bei index i gibt)
        if ( i < 0 || i > lastIndex) {
            return s;
        }
        //nutzung von stringbuilder klasse, um deleteCharAt()-Methode nutzen zu können (relevant, um aufgabe ohne schleife zu lösen)
        StringBuilder sb = new StringBuilder(s);
        //löschen des chars bei index i 
        sb = sb.deleteCharAt(i);
        //ausgabe der lösung (toString()-Methode, weil lösung bis jetzt ein stringBuilder ist, aber ein String als ausgabe erwartet wird)
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = missingChar("Hello", 3);
        System.out.println(s); // => Helo
        System.out.println(missingChar("Hello", 1));  // => Hllo
        System.out.println(missingChar("Hello", 4));  // => Hell
        System.out.println(missingChar("Hello", -1)); // => Hello
        System.out.println(missingChar("Hello", 10)); // => Hello
    }
}
