import java.util.Scanner;

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

    public void fragenBeantworten(Scanner scanner){
        System.out.println("frage");  //hier bräuchte ich eine Frage von einem Studenten, "frage" ist hier mal für mich ein Platzhalter
        System.out.println("---------------------");
        System.out.println("Sie können jetzt die Frage beantworten:");
        System.out.println("---------------------");

        String antwort = scanner.nextLine(); // hier wird die Antwort des Dozenten gespeichert
        
        System.out.println("Ihre Antwort: " + antwort);     // hier wird entweder für den Dozenten nochmal für ihn angezeigt was er eingeben hat oder wir streichen das aus und die antwort würde nur dem Studenten ausgegeben :)
        System.out.println("---------------------");      //maybe raustreichen?  
        System.out.println("Vielen Dank für Ihre Antwort!");
        System.out.println("---------------------");
    } // die outputs sind halt jetzt sehr aus der sich meines dozenten als user, müssen wir uns noch zusammen hocken und schauen wie es zusammen geht
}