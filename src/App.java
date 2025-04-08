
public class App {
    public static void main(String[] args) throws Exception {

        Studierende anna = new Studierende("Anna", "Informatik", 123456);
        Dozierende mustermann = new Dozierende("Herr Musterman", "THI", 123);

        System.out.println(mustermann.getName() + " ist Dozierender an der " + mustermann.getFakultaet() + " mit der Bueronummer: " + mustermann.getBueroNummer());

        anna.frageStellen(mustermann,"Mögen sie mich?"); // hier wird die Frage gestellt, die der Student stellen möchte
        mustermann.frageBeantworten(anna, "NEIN");  // () können wir bei Scanner frei lassen, ansonsten müsste hier die Antwort rein
        mustermann.Bewertung(anna, 5);
        anna.sprechstundenAnfrage(mustermann, 12, 12, 15);
    }
}
