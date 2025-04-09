
public class Lehrveranstaltung {
    private String titel;
    private Dozierende dozierender;
    private int anzahlTeilnehmer;
    private int praktikumsstundeCounter = 0;
    private int vorlesungsstundeCounter = 0;


    public String getTitel() {
        return titel;
    }

    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }

    Lehrveranstaltung(String titel, Dozierende dozierender) {
        this.titel = titel;
        this.dozierender = dozierender;
    }


    public void addStudent(Studierende student, Lehrveranstaltung lehrveranstaltung) {
        this.anzahlTeilnehmer ++;
        dozierender.acceptLehrveranstaltung(student, this);
        System.out.println("--------------------");
        System.out.println("Der Student " + student.getName() + " hat die Lehrveranstaltung " +
                  lehrveranstaltung.getTitel() + " betreten.");



    }

    public void removeStudent(Studierende student, Lehrveranstaltung lehrveranstaltung) {
        this.anzahlTeilnehmer--;
        System.out.println("--------------------");
        System.out.println("Der Student " + student.getName() + " hat die Lehrveranstaltung " +
                lehrveranstaltung.getTitel() + " verlassen.");

    }

    public void addPraktikumsstunden(String thema, int datum, int uhrzeit, int raum) {
        Praktikumsstunde newPraktikumsstunde = new Praktikumsstunde(thema, datum, uhrzeit, raum);
        System.out.println("--------------------");
        System.out.println("Du hast eine neue Praktikumsstunde erstellt: " + newPraktikumsstunde.getThema() +
                " am " + newPraktikumsstunde.getDatum() + " um " + newPraktikumsstunde.getUhrzeit() +
                " Uhr im Raum " + newPraktikumsstunde.getRaum());
        praktikumsstundeCounter++;


    }

    public void addVorlesungsstunden(String thema, int datum, int uhrzeit, int raum) {
        Vorlesungstunde newVorlesungsstunde = new Vorlesungstunde(thema, datum, uhrzeit, raum);
        System.out.println("--------------------");
        System.out.println("Du hast eine neue Vorlesungsstunde erstellt: " + newVorlesungsstunde.getThema() +  " am " +
                newVorlesungsstunde.getDatum() + " um " + newVorlesungsstunde.getUhrzeit() + " Uhr im Raum " +
                newVorlesungsstunde.getRaum());
        vorlesungsstundeCounter++;

    }

    public void showLehrveranstaltung() {
        System.out.println("--------------------");
        System.out.println("Lehrveranstaltung: " + titel + " \nDozierender: " + dozierender.getName() + " \nAnzahl Teilnehmer: " + anzahlTeilnehmer +
                " \nPraktikumsstunden: " + praktikumsstundeCounter + " \nVorlesungsstunden: " + vorlesungsstundeCounter);
    }

}









