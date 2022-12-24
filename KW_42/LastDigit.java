/**
 * ## Letzte Ziffer
 * 
 * Entwickeln Sie nun bitte eine Methode `lastDigit()`, die
 * für zwei Zahlen (Dezimalnotation) prüft, ob diese dieselbe letzte Ziffer haben.
 * 
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Der Modulo Operator % ist sicher hilfreich (siehe Unit 2, arithmetische Operatoren)
 * - Einen Betrag können Sie mittels `Math.abs()` bestimmen.
 * 
 */
class LastDigit {

    public static boolean lastDigit(int a, int b) {
        //der modulo 10 gibt die letzte ziffer einer zahl wieder 
        //die ergebnisse der modulo 10 auf beide parameter werden verglichen. 
        //sind die ergebnisse gleich, wird true zurückgegeben
        if (Math.abs(a % 10) == Math.abs(b % 10)) {
        
            return true;
        } 
        //Methode gibt false zurück, sollte der if-block nicht ausgeführt werden
        return false;
    }
    public static void main(String[] args) {
        boolean result = lastDigit(21, 12);
        System.out.println(result); // => false
        System.out.println(lastDigit(121, 2001)); // => true
    }
}
