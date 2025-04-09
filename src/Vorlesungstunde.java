public class Vorlesungstunde {
    private String thema;
    private int datum;
    private int uhrzeit;
    private int raum;

    public Vorlesungstunde(String thema, int datum, int uhrzeit, int raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void showVorlesungstunde(){
        System.out.println("Vorlesungsstunde: " + thema + " am " + datum + " um " + uhrzeit + " Uhr im Raum " + raum);
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
    
    
}
