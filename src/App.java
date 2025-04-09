
public class App {
    public static void main(String[] args) throws Exception {

        Studierende anna = new Studierende("Anna", "Informatik", 123456);
        Studierende markus = new Studierende("Markus","Informatik", 654321);
        Dozierende mustermann = new Dozierende("Herr Musterman", "THI", 123);

        //System.out.println(mustermann.getName() + " ist Dozierender an der " + mustermann.getFakultaet() + " mit der Bueronummer: " + mustermann.getBueroNummer());
        mustermann.infoDozent(); //anstatt langer output

        anna.frageStellen(mustermann,"Mögen sie mich?");
        mustermann.frageBeantworten(anna, "NEIN"); 
        mustermann.Bewertung(anna, 6);
        anna.sprechstundenAnfrage(mustermann, 12, 12, 15);
        mustermann.Bewertung(anna, 2);
        mustermann.Bewertung(markus, 3);

        mustermann.printBewertung();
    }
}
