public class Hello {

    public static String hello(String name) {
        String greeting = ("Hello " + name.trim()).trim() + "!";
        return greeting;
    }
    
    public static void main(String[] args) {
        String greet = hello("Max");
        System.out.println(greet);
        System.out.println(greet); // => "Hello Max!"
        System.out.println(hello("Moritz")); // => "Hello Moritz!"
        
        // Achten sie auf die Leerzeichen
        System.out.println(hello("Maren ")); // => "Hello Maren!"
        System.out.println(hello(" Tessa")); // => "Hello Tessa!"
    
        System.out.println(hello("")); // => "Hello!"
    }
}