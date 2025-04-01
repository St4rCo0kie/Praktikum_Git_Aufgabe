import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Scanner scanner = new Scanner(System.in);

        Dozierende mustermann = new Dozierende("Herr Musterman", "THI", 123);
        System.out.println(mustermann.getName() + " ist Dozierender an der " + mustermann.getFakultaet() + " mit der Bueronummer: " + mustermann.getBueroNummer());
        mustermann.fragenBeantworten(scanner); // () können wir bei Scanner frei lassen, ansonsten müsste hier die Antwort rein
        
        scanner.close();
    }
}
