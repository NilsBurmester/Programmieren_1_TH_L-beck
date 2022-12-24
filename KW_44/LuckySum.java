/*
 * ## Addieren mit der `luckySum()`
 * 
 * Entwickeln Sie nun bitte eine Methode `luckySum()`, die eine 
 * variable Anzahl von ganzzahligen Parametern solange aufaddiert bis
 * der Wert 13 in einem Parameter auftaucht.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweis:__
 * 
 * - Sehen Sie sich noch einmal variable Parameter in Unit 2 (Methoden) an. 
 * 
 */
class LuckySum {
//Parameter mit "int... a" deklarieren, da wir eine variable anzahl an parametern haben
    public static int luckySum(int... a) {
        //aggregatvariable für Lösung
        int solution = 0;
        //for-each-loop über alle parameter
        for (int i : a) {
            //ist die aktuelle zahl = 13, beende den loop
            if (i == 13) {
                break;
            }
            //ansonsten addiere die aktuelle zahl auf die aggregatvariable
            solution += i;
        }
        //ausgabe der Lösung
        return solution;
    }
    
    public static void main(String[] args) {
        int result = luckySum(5, 6, 13, 8);
        System.out.println(result); // => 11
        System.out.println(luckySum(1, 2, 3, 4, 5)); // => 15
        System.out.println(luckySum(1, 2)); // => 3
        System.out.println(luckySum(13)); // => 0
    }
}
