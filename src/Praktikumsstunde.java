public class Praktikumsstunde {
    private String thema;
    private int datum;
    private int uhrzeit;
    private int raum;
    private String aufgaben;

    public Praktikumsstunde(String thema, int datum, int uhrzeit, int raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }
    public void showPraktikumstunde(){
        System.out.println("Praktikumstunde: " + thema + " am " + datum + " um " + uhrzeit + " Uhr im Raum " + raum + ". Aufgaben: " + aufgaben);
    }

    public String getThema() {
        return thema;
    }
    public int getDatum() {
        return datum;
    }
    public int getUhrzeit() {
        return uhrzeit;
    }
    public int getRaum() {
        return raum;
    }
    public String getAufgaben() {
        return aufgaben;
    }

    public String setAufgaben(String aufgaben) {
        this.aufgaben = aufgaben;
        return aufgaben;
    }

    public void auflistenAufgaben() {
        System.out.println("Aufgaben: " + aufgaben);
    }

}
