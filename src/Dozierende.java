// Dozierende.java
public class Dozierende {
    private final String dNamen;
    private final String fakultaet;
    private final int bueroNummer;
    int gesamtBewertung;

    public Dozierende(String dNamen, String fakultaet, int bueroNummer) {
        this.dNamen = dNamen;
        this.fakultaet = fakultaet;
        this.bueroNummer = bueroNummer;
        this.gesamtBewertung = 3;

    }
    
    public String getName(){               // getter falls wir die Dozenten variablen in Main oder Studenten brauchen 
        return dNamen;
    }
    public String getFakultaet(){
        return fakultaet;
    }
    public int getBueroNummer(){
        return bueroNummer;
    }

    public void frageBeantworten(Studierende student, String antwort) { // hier wird die Frage beantwortet, die der Student gestellt hat
        System.out.println(dNamen + " antwortet " + student.getName() + ": " + antwort);  // hier wird die Antwort ausgegeben, die der Dozent gegeben ha
    } // die outputs sind halt jetzt sehr aus der sich meines dozenten als user, müssen wir uns noch zusammen hocken und schauen wie es zusammen geht

    public int Bewertung(Studierende studierende, int bewertung) { // hier wird die Bewertung beantwortet, die der Dozent gestellt hat
        if (bewertung < 1 || bewertung > 6) {
            System.out.println("Die Bewertung muss zwischen 1 und 6 sein.");
        } else {
            bewertung =  (this.gesamtBewertung + bewertung) / 2;
            this.gesamtBewertung = bewertung;
            System.out.println("Sie haben eine Bewertung abgegeben. Der neue durchschnitt ist: " + bewertung);
        }
        return bewertung;
    }
}