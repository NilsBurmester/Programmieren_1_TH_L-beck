/**
 * ## Ein Passwort-Generator
 * 
 * Schreiben Sie nun bitte eine Methode `pwdgen()` zum Generieren von
 * Passwörtern.
 * 
 * - Passwörter sollen dabei aus einem Satz gebildet werden. 
 * - Worte in dem Satz sind durch ein oder mehrere  Leerzeichen voneinander
 *   getrennt.
 * - Für jedes Wort soll abwechselnd der erste oder letzte Buchstabe des
 *   Wortes genommen werden.
 * - Die Anzahl an Worten soll an den Anfang des Passworts gesetzt werden.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * 
 * __Hinweise:__
 * 
 * - Die String-Methode `split()` ist sicher hilfreich.
 * - Beachten Sie, dass Sätze mit Leerzeichen beginnen oder enden können.
 * 
 * __Achtung:__ Ab sofort werden keine Methodenköpfe mehr vorgegeben. 
 * Diese aus der Problemformulierung zu bestimmen, ist Teil der Aufgabe.
 * 
 */
class Pwdgen {
    
    public static String pwdgen(String s) {
        //ist der parameter leer, soll nur die länge, also 0, ausgegeben werden
        if (s.isBlank()) {
            return "0";
        }
        //leerzeichen am anfang und am ende des strings löschen, damit es keine probleme mit split() gibt
        s = s.trim();
        //erstellung eines arrays mit allen worten aus dem parameter string. der string wird immer gesplittet, wenn ein oder mehrere leerzeichen vorkommen (mittels " +" angegeben)
        String[] words = s.split(" +");
        //zählvariable für den for-each-loop
        int i = 0; 
        //aggregatvariable für das generierte Passwort, die anzahl der wörter schon eingefügt 
        //(anzahl ist ein integer, deswegen muss tostring() benutzt werden, damit die zahl in den String gesetzt werden kann)
        String password = Integer.toString(words.length);
        //for each loop zum prüfen aller wörter im words-array
        for (String word : words) {
           //gekürtzte if-anweisung (tenary operator)
           //ist die zählvariable durch 2 teilbar, füge den ersten buchstaben zum passwort hinzu, wenn nicht, dann den lezten (die wörter müssen auch alle getrimmt werden, um leerzeichen am angfang und ende zu vermeiden)
            password += i % 2 == 0 ? word.trim().charAt(0) : word.trim().charAt(word.length() - 1);
            //ist das wort geprüft worden wird die zählvariable um 1 hochgezählt
            i++;
        }
        //rückgabe der lösung
        return password; 
    }
    public static void main(String[] args) {
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc
    }
}