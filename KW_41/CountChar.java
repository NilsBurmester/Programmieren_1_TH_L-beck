/**
 * ## Zeichen zählen
 * 
 * Entwickeln Sie bitte eine Methode `countChar()`, die zählt wie oft
 * ein Zeichen in einer Zeichenkette vorkommt. Das Zählen soll
 * case-insenstiv erfolgen (d.h. 'a' ist wie 'A' zu zählen).
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `length()`
 * - `toLowerCase()` und `toUpperCase()` 
 * - `replaceAll()`
 * 
 */
class CountChar {

    public static int countChars(char c, String s) {
        //zählen soll unabhängig von upper- oder lowerCase sein, daher prüfen, ob parameter c groß oder klein ist und parameter s entsprechend ganz in groß- oder kleinschreibung änder
        if (Character.isLowerCase(c)) {
            s = s.toLowerCase();
        } else {
            s = s.toUpperCase();
        }
        //alle characters im String s mit leeren string ersetzen und die länge ermitteln
        int subtraction = s.replaceAll(Character.toString(c), "").length();
        //von der länge des parameters s die länge ohne parameter c abziehen, ergebnnis ist die anzahl von c in s
        return s.length() - subtraction;
    }

    public static void main(String[] args) {
        int n = countChars('a', "Abc");
        System.out.println(n); // => 1
        System.out.println(countChars('A', "abc")); // => 1
        System.out.println(countChars('x', "ABC")); // => 0
        System.out.println(countChars('!', "!!!")); // => 3
    }
}