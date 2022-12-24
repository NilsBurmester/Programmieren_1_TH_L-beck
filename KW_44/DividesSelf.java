/**
 * ## Selbstteilende Zahlen
 * 
 * Entwickeln Sie nun bitte eine Methode `dividesSelf()`, die prüft, 
 * ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend, wenn
 * alle ihre Stellen die Zahl ganzzahlig teilt.
 * 
 * Da durch den Wert 0 bekanntlich nicht geteilt werden kann, können alle 
 * Zahlen mit einer Nullziffer (Dezimalnotation) nicht sich selbstteilend
 * sein.
 *  
 * z.B.: 128 = 128 % 1 == 0 && 128 % 2 == 0 && 128 % 8 == 0
 * 
 * Entwickeln Sie zusätzlich eine Methode `countDividesSelf()` die
 * angibt, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen
 * Schranke gibt.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Mittels % 10 können Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 können Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 * 
 */
class DividesSelf {

    public static boolean dividesSelf(int x) {
        //guard-klausel: 0 kann nicht durch 0 geteilt werden
        if (x == 0) return false;
        //rest = alle ziffern außer die letzte
        int rest = x;
        //ziffer = zahl durch die geteilt wird
        int ziffer;
        //solange der rest größer 0 ist, gibt es weitere Ziffern in x, die man prüfen muss
        while (rest > 0) {
            //modulo 10 gibt die letzte ziffer zurück
            ziffer = rest % 10;
            //durch 10 teilen schiebt die letzte ziffer raus
            rest /= 10;
            //durch 0 kann nicht geteilt werden
            if (ziffer == 0) {
                return false;
            }
            //wenn x nicht durch die ziffer geteilt werden kann, gib false zurück
            if (!(x % ziffer == 0)) {
                return false;
            }
        }
        //gib ansonsten true zurück
        return true;
    }
    
    public static int countDividesSelf(int n) {
        int solution = 0;

        for (int i = 0; i < n; i++) {
            if (dividesSelf(i)) solution += 1;
        }
        return solution;
    }

    public static void main(String[] args) {

       boolean result = dividesSelf(128);
        System.out.println(result); // => true
        System.out.println(dividesSelf(12)); // => true
        System.out.println(dividesSelf(102)); // => false

        int n = countDividesSelf(10);
        System.out.println(n); // => 9
        System.out.println(countDividesSelf(100)); // => 23
        System.out.println(countDividesSelf(1000)); // => 79
    }    
}
