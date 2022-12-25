package KW_45;

/**
 * ## Armstrongzahlen
 * 
 * Ja, so etwas gibt es. Eine Armstrongzahl ist eine Zahl, 
 * deren Summe ihrer Stellen, jeweils potenziert mit ihrer Stellenanzahl, 
 * wieder die Zahl selbst ergibt.
 * 
 * Z.B.: $153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$
 * 
 * Entwickeln Sie nun bitte eine Methode `isArmstrong()`, die prüft, 
 * ob eine Zahl eine Armstrongzahl ist.
 * 
 * Entwickeln Sie zusätzlich eine Methode `countArmstrongs()` die
 * angibt, wieviele Armstrongzahlen es bis zu einer oberen
 * Schranke gibt.
 * 
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - https://de.wikipedia.org/wiki/Narzisstische_Zahl
 * - Mittels % 10 koennen Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 koennen Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 * 
 */
class IsArmstrong {
    
    public static boolean isArmstrong(int n) {
        int length = (int) (Math.log10(n) + 1);
        double pow = length;
        int zahl = n;
        int count = 0;
        
        while (zahl > 0) {
            
            count = count + (int) (Math.pow(zahl % 10, pow));
            zahl = zahl / 10;
        }
        int counter = (int) count;
        if (counter != n) return false;
        return true;
    }

    public static int countArmstrongs(int m) {
        int count = 0;
        
        for (int i = 0; i <= m; i++) {
            if (isArmstrong(i) == true) count++;
        }
        return count; 
    }
    public static void main(String[] args) {

        boolean result = isArmstrong(153);
        System.out.println(result); // => true
        System.out.println(isArmstrong(999)); // => false

        int n = countArmstrongs(100);
        System.out.println(n); // => 10
        System.out.println(countArmstrongs(153)); // => 11
        System.out.println(countArmstrongs(1000)); // => 14
    }    
}