
public class Lehrveranstaltung {
    private String titel;
    private Dozierende dozierender;
    private int anzahlTeilnehmer = 0;


    public String getTitel() {
        return titel;
    }

    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }

    public void Lehrveranstaltung(String titel, Dozierende dozierender) {
        this.titel = titel;
        this.dozierender = dozierender;
    }


    public void addStudent(Studierende student, Lehrveranstaltung lehrveranstaltung) {
        dozierender.acceptLehrveranstaltung(student, this);
        anzahlTeilnehmer++;
    }

    public void removeStudent(Studierende student, Lehrveranstaltung lehrveranstaltung) {
        System.out.println("Der Student " + student.getName() + " hat die Lehrveranstaltung " +
                lehrveranstaltung.getTitel() + " verlassen.");
        anzahlTeilnehmer--;
    }

    public void addPraktikumsstunden(String thema, int datum, int uhrzeit, int raum) {

        Praktikumsstunde newPraktikumsstunde = new Praktikumsstunde(thema, datum, uhrzeit, raum);
        System.out.println("Du hast eine neue Praktikumsstunde erstellt: " + newPraktikumsstunde.getThema() +
                " am " + newPraktikumsstunde.getDatum() + " um " + newPraktikumsstunde.getUhrzeit() +
                " Uhr im Raum " + newPraktikumsstunde.getRaum());


    }

    public void addVorlesungsstunden(String thema, int datum, int uhrzeit, int raum) {

        }

    }

    public void removeVorlesungsstunden(Vorlesungstunde vorlesungsstunden) {

    }





}

