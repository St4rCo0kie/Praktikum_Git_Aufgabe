
public class App {
    public static void main(String[] args) throws Exception {

        Studierende anna = new Studierende("Anna", "Informatik", 123456);
        Studierende markus = new Studierende("Markus","Informatik", 654321);
        Studierende max = new Studierende("Max", "Informatik", 789123);
        Dozierende mustermann = new Dozierende("Herr Mustermann", "Informatik", 123);
        Lehrveranstaltung programmieren = new Lehrveranstaltung("Programmieren", mustermann);


        //System.out.println(mustermann.getName() + " ist Dozierender an der " + mustermann.getFakultaet() + " mit der Bueronummer: " + mustermann.getBueroNummer());
        mustermann.infoDozent(); //anstatt langer output

        anna.frageStellen(mustermann,"Mögen sie mich?");
        mustermann.frageBeantworten(anna, "NEIN"); 
        mustermann.Bewertung(anna, 6);
        anna.sprechstundenAnfrage(mustermann, 12, 12, 15);
        mustermann.Bewertung(anna, 2);
        mustermann.Bewertung(markus, 3);
        mustermann.printBewertung();




        programmieren.addPraktikumsstunden("Praktikumsstunde", 12, 12, 15);
        programmieren.addVorlesungsstunden("Einfuhrung", 12, 12, 15);
        programmieren.addVorlesungsstunden("Grundlagen", 12, 12, 15);
        anna.requestVorlesungsstunde(mustermann, programmieren, 12, 12, 15);
        programmieren.addStudent(anna, programmieren);
        markus.requestVorlesungsstunde(mustermann, programmieren, 12, 12, 15);
        programmieren.addStudent(markus, programmieren);
        programmieren.showLehrveranstaltung();

    }
}
