import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Spielzeugkiste.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielzeugkiste
{
    private ArrayList<Baukloetze> inhalt;
    private double gesamtgewicht;

    /**
     * Konstruktor für Objekte der Klasse Spielzeugkiste
     */
    public Spielzeugkiste()
    {
        inhalt=new ArrayList();
        gesamtgewicht=0;
    }

    public void gibAlle()
    {
        for (Baukloetze klotz : inhalt) {
            System.out.println(klotz.gibGewicht());
        }
    }
    
    public void gibGewicht()
    {
        gesamtgewicht=0;
        for (Baukloetze klotz : inhalt) {
           gesamtgewicht+=klotz.gibGewicht();
        }
        System.out.println(gesamtgewicht);
    }
    
    public void hinzufuegen(Baukloetze klotz)
    {
        inhalt.add(klotz);
    }
    
    public void entfernen(int position)
    {
        inhalt.remove(position);
    }
}
