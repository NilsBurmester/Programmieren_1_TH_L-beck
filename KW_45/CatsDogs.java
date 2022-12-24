package KW_45;

/**
 * ## Cats and Dogs
 * 
 * Entwickeln Sie bitte eine Methode `catsDogs()`,
 * die prüft, ob in einer Zeichenkette gleich häufig
 * die Zeichenketten "cat" und "dog" vorkommen.
 * 
 * Wenn weder "cat" noch "dog" vorkommen, ist dies als
 * nicht gleich häufig zu werten.
 * 
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 * 
 * Challenge: Lösen Sie die Aufgabe ohne Schleifen.
 * 
 */
class CatsDogs {

    public static Boolean catsDog(String s) {
        //wenn s leer ist, gib false zurück
        if (s.isEmpty()) return false;
        //alle cat aus entfernen
        String withoutCats = s.replaceAll("cat", "");
        //alle dog aus s entfernen
        String withoutDogs = s.replaceAll("dog", "");
        //prüfen, ob die länge von s ohne cat und ohne dog gleich ist. wenn ja, hat s die selbe anzahl von cat und dog 
        //dies gilt aber nur, wenn die Längen von withoutCat und withoutDog ungleich der länge von s sind (weil sonst keins von beiden in s vorkommt)
        if (withoutCats.length() == withoutDogs.length() && withoutCats.length() != s.length() && withoutDogs.length() != s.length()) {
            return true;
        }
        //ansonsten gib false zurück
        return false;
    }
    public static void main(String[] args) {
        boolean r = catsDog("catdog");
        System.out.println(r); // => true
        System.out.println(catsDog("catcat")); // => false
        System.out.println(catsDog("1cat1cadodog")); // => true
    }
}

