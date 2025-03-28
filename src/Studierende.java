public class Studierende {
    private String name;
    private String studiengang;
    private int matrikelnummer;

    public void frageStellen() {
        System.out.println("Der Studierende " + name + " stellt eine Frage an den Dozierenden.");

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudiengang() {
        return studiengang;
    }
    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
    public int getMatrikelnummer() {
        return matrikelnummer;
    }
    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
}
