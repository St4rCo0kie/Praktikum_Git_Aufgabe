public class Studierende {
    private String name;
    private String studiengang;
    private int matrikelnummer;
    private String frage;
    private int sprechstundenZeit;
    private int sprechstundenTag;
    private int sprechstundenMonat;

    //private static final String DEFAULT_ANSWER = " Frage erhalten..";

    public Studierende(String name, String studiengang, int matrikelnummer) {
        this.name = name;
        this.studiengang = studiengang;
        this.matrikelnummer = matrikelnummer;
        this.frage = "";
    }

    public void frageStellen(Dozierende dozierender, String frage) {

        if (frage.isEmpty()) {
            System.out.println("--------------------");
            System.out.println(name + " hat keine Frage gestellt.");
            return;
        }
        this.frage = frage;
        System.out.println("--------------------");
        System.out.println(name + " fragt " + dozierender.getName() + ": " + frage);
        //dozierender.frageBeantworten(this, "");

        this.frage = ""; //Clear frage
    }

    public void sprechstundenAnfrage(Dozierende dozierender, int sprechstundenTag , int sprechstundenMonat, int sprechstundenZeit) {
        this.sprechstundenMonat = sprechstundenMonat;
        this.sprechstundenTag = sprechstundenTag;
        this.sprechstundenZeit = sprechstundenZeit;

        System.out.println("--------------------");
        System.out.println("Der Studierende " + name + " fragt eine Sprechstunde an mit dem Dozenten " +
                dozierender.getName() + " am " + sprechstundenTag + "." + sprechstundenMonat + "." + " um " + sprechstundenZeit + " Uhr.");

    }

    public void requestVorlesungsstunde(Dozierende dozierender, Lehrveranstaltung lehrveranstaltung, int datum, int uhrzeit, int raum) {
        System.out.println("--------------------");
        System.out.println("Der Studierende " + name + " fragt eine Vorlesungsstunde an mit dem Dozenten " +
                dozierender.getName() + " am " + datum + " um " + uhrzeit + " Uhr im Raum " + raum);
    }

    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public String getName() {
        return name;
    }
    public String getStudiengang() {
        return studiengang;
    }
    public int getMatrikelnummer() {
        return matrikelnummer;
    }
}
