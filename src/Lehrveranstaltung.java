import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Lehrveranstaltung {
    private String titel;
    Dozierende dozierender;
    Studierende student;
    private String[] teilnehmer;
    //Vorlesungsstunden vorlesungstunden;
    private int vorlesungsstundenCount;
    private Vorlesungsstunden[] vorlesungsstundenList;
    private int anzahlTeilnehmer;
    //Praktikumsstunden praktikumsstunden;

    public void Lehrveranstaltung(String titel, Dozierende dozierender) {
        this.titel = titel;
        this.dozierender = dozierender;
    }


    public void addStudent(Studierende student) {
        anzahlTeilnehmer++;
    }

    public void removeStudent(Studierende student, )  {
        anzahlTeilnehmer--;
        }

    public void addPraktikumsstunden(Praktikumsstunden praktikumsstunden) {

    }

    public void removePraktikumsstunden(Praktikumsstunden praktikumsstunden) {

    }

    public void addVorlesungsstunden(Vorlesungsstunden vorlesungsstunden) {

    }

    public void removeVorlesungsstunden(Vorlesungsstunden vorlesungsstunden) {

    }



    public String getTitel() {
        return titel;
    }

    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }

}
