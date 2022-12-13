/**
 * ## Zeichenketten "rotieren"
 * 
 * Entwickeln Sie nun bitte eine Methode `rotate()`, die eine Zeichenkette
 * nach links oder rechts "rotiert". Zeichen die links oder rechts aus
 * der Zeichenkette "geschoben" werden, sollen rechts bzw. links wieder
 * "hineingeschoben" werden.
 *  
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Beachten Sie, dass eine Rotation positiv und negativ sein kann.
 * - Beachten Sie, dass eine Rotation länger als die eigentliche Zeichenkette sein kann.
 * - Das Problem lässt sich tatsächlich ohne Schleife lösen (sicherlich aber auch mit ;-).
 * 
 */
class Rotate {

    public static String rotate(int n, String s) {
        //länge des strings ermitteln, der rotiert wird
        int length = s.length();
        //wenn um 0 stellen rotiert werden soll, wird der ausgangsString zurückgegeben
        if (n == 0) return s;
        //wenn anzahl der rotationen gleich der länge des strings ist oder der string nur ein zeichen hat, soll ebenfalls der string zurückgegeben werden
        if (length == n || length == 1) return s;
        //wenn n größer 0 ist, wird nach rechts rotiert
        if (n > 0) {
            //newN ist der index, ab dem nach rechts rausgeschoben wird (n % length gibt die anzahl an buschstaben an, die rotiert werden)
            int newN = length - (n % length);
            //rückgabe von den rotierten buchstaben + rest
            return s.substring(newN) + s.substring(0, newN);
        }
        //ist n kleiner 0, wird nach links rotiert. da n < 0 brauchen wir den absoluten Wert 
        int newN = Math.abs(n) % length;
        //rückgabe der rotierten buchstaben + Rest
        return s.substring(newN) + s.substring(0, newN);
    
    }

    public static void main(String[] args) {
        String result = rotate(2, "Hello");
        System.out.println(result); // => "loHel"
        System.out.println(rotate(3, "Hello")); // => "lloHe"
        System.out.println(rotate(6, "Hello")); // => "oHell"
    }    
}