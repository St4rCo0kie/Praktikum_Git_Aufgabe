// Dozierende.java
public class Dozierende {
    private final String dNamen;
    private final String fakultaet;
    private final int bueroNummer;
    private int gesamtBewertung;
    private int anzahlBewertungen = 0;
    private int durchschnittBewertung = 0;

    public Dozierende(String dNamen, String fakultaet, int bueroNummer) {
        this.dNamen = dNamen;
        this.fakultaet = fakultaet;
        this.bueroNummer = bueroNummer;
        this.gesamtBewertung = 0;

    }
    
    public void infoDozent(){
        System.out.println("--------------------");
        System.out.println("Dozent: " + dNamen);
        System.out.println("Fakultaet: " + fakultaet);
        System.out.println("Büro Nummer: " + bueroNummer);
    }    

    public String getName(){               
        return dNamen;
    }
    public String getFakultaet(){
        return fakultaet;
    }
    public int getBueroNummer(){
        return bueroNummer;
    }

    public void frageBeantworten(Studierende student, String antwort) {
        System.out.println("--------------------");
        System.out.println(dNamen + " antwortet " + student.getName() + ": " + antwort);  
    }

    public void Bewertung(Studierende studierende, int bewertung) { 
        if (bewertung < 1 || bewertung > 6) {
            System.out.println("--------------------");
            System.out.println("Die Bewertung muss zwischen 1 und 6 sein.");
        } else {
                gesamtBewertung = bewertung + gesamtBewertung;
                anzahlBewertungen++;
                durchschnittBewertung = gesamtBewertung / anzahlBewertungen;
                System.out.println("--------------------");
                System.out.println("Danke für das Feedback, " + studierende.getName() + "!");
        }
    }

    public void printBewertung(){
        System.out.println("--------------------");
        System.out.println("Dozent: " + dNamen);
        System.out.println("Anzahl Bewertungen: " + anzahlBewertungen);
        System.out.println("Durchschnittliche Bewertung: " + durchschnittBewertung);


    }
    public void acceptSprechstunde(Studierende student, int sprechstundenTag , int sprechstundenMonat, int sprechstundenZeit) {
        System.out.println("--------------------");
        System.out.println("Der Dozent " + dNamen + " akzeptiert die Sprechstunde von " + student.getName() + " am " + sprechstundenTag + "." + sprechstundenMonat + "." + " um " + sprechstundenZeit + " Uhr.");
    }

    public boolean acceptLehrveranstaltung(Studierende student, Lehrveranstaltung lehrveranstaltung) {
        System.out.println("--------------------");
        System.out.println("Der Dozent " + dNamen + " akzeptiert die Lehrveranstaltung: " + lehrveranstaltung.getName() + ".");
        return true;
    }
}