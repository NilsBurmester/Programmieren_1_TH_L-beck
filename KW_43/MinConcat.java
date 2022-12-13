/**
 * 
 *  ## Zeichenketten aneinander hängen
 * 
 * Entwickeln Sie bitte eine Methode `minConcat()`,
 * die zwei Zeichenketten unterschiedlicher Länge
 * aneinander hängt. Dabei soll die längere der
 * beiden Zeichenketten auf die Länge der kürzeren
 * Zeichenkette so gekürzt werden, dass die ersten
 * Zeichen der Zeichenkette nicht in das Resultat
 * übernommen werden.
 * 
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 * 
 */
class MinConcat {

    public static String minConcat(String a, String b) {
        //ist länge von a >= länge von b?
        if (a.length() >= b.length()) {
            //die ersten n zeichen (differenz der längen a und b) aus a entfernen und den rest zusammen mit b ausgeben
            return a.substring(a.length() - b.length()) + b;
        }
        //dasselbe wie oben, nur umgekehrt
        return a + b.substring(b.length() - a.length());
        
    }

    public static void main(String[] args) {

        String resultat = minConcat("Hello", "Hi");
        System.out.println(resultat); // => "loHi"
        
        System.out.println(minConcat("Hello", "java"));
        // => "ellojava"
        System.out.println(minConcat("java", "Hello"));
        // => "javaello"
    }
}

