// Dozierende.java
public class Dozierende {
    private final String dNamen;
    private final String fakultaet;
    private final int bueroNummer;

    public Dozierende(String dNamen, String fakultaet, int bueroNummer) {
        this.dNamen = dNamen;
        this.fakultaet = fakultaet;
        this.bueroNummer = bueroNummer;
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

    public String frageBeantworten(Studierende student, String antwort) { // hier wird die Frage beantwortet, die der Student gestellt hat
        System.out.println(dNamen + " antwortet " + student.getName() + ": " + antwort);  // hier wird die Antwort ausgegeben, die der Dozent gegeben hat
        return antwort;
    } // die outputs sind halt jetzt sehr aus der sich meines dozenten als user, müssen wir uns noch zusammen hocken und schauen wie es zusammen geht
}