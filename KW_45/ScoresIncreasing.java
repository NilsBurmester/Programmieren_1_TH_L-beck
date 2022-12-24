package KW_45;

/**
 * ## Sortierung von Arrays prüfen
 * 
 * Sie sollen nun eine Methode `scoresIncreasing()` entwickeln,
 * die für ein gegebenes Array prüft, ob alle Wert in diesem
 * Array aufsteigend sortiert sind oder das Array leer ist.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweis:__
 * 
 * - Sehen Sie sich Arrays in Unit 03 noch einmal an.
 * 
 */
class ScoresIncreasing {
    
    public static Boolean scoresIncreasing(int[] a) {
        //Array durchgehen
        for (int n = 0; n < a.length - 1; n++) {
            //wenn jetziger score größer ist als der nächste score, gib falsch zurück
            if (a[n] > a[n + 1]) {
                return false;
            }
        }
        //gib ansonsten true zurück
        return true; 
    }
    public static void main(String[] args) {
        int[] d1 = {1, 3, 4};

        boolean increasing = scoresIncreasing(d1);
        System.out.println(increasing); // => true

        int[] d2 = {1, 3, 2};
        System.out.println(scoresIncreasing(d2)); // => false
        
        int[] d3 = {1, 1, 4};
        System.out.println(scoresIncreasing(d3)); // => true

        int[] d4 = {1};
        System.out.println(scoresIncreasing(d4)); // => true
    }
}
