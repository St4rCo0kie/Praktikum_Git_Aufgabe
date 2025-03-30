public class Studierende {
    private String name;
    private String studiengang;
    private int matrikelnummer;
    private String frage;
    private static final String DEFAULT_ANSWER = " Frage erhalten..";

    public Studierende(String name, String studiengang, int matrikelnummer) {
        this.name = name;
        this.studiengang = studiengang;
        this.matrikelnummer = matrikelnummer;
        this.frage = "";
    }

    public void frageStellen(Dozierender dozierender, String frage) {

        if (frage.isEmpty()) {
            System.out.println(name + " hat keine Frage gestellt.");
            return;
        }

        System.out.println(name + " fragt " + dozierender.getName() + ": " + frage);
        dozierender.frageBeantworten(name, DEFAULT_ANSWER);

        this.frage = ""; //Clear frage
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
}
