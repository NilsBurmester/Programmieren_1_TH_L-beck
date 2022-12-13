/**
 * ## Zeichenketten klammern
 * 
 * Schreiben Sie eine Methode `embedCenter()`, die eine payload Zeichenkette in die 
 * Mitte einer anderen Klammer-Zeichenkette setzt.
 * 
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *   
 * __Hinweise:__
 * 
 * - Beachten Sie Sonderfälle wie leere Klammer und Payload Zeichenketten.
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * 
 */
class EmbedCenter {

    public static String embedCenter(String embed, String payLoad) {
        //mitte von embed finden
        int index = embed.length() / 2;
        //erste hälfte von embed + payload + zweite Hälfte von embed
        String newString = embed.substring(0,index) + payLoad + embed.substring(index);
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(embedCenter("", "t")); // => <<Yay>>
        System.out.println(embedCenter("()", "Yay")); // => (Yay)
        System.out.println(embedCenter(":-)", "Example")); // :Example-)
    }
}
