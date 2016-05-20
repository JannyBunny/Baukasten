import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Spielzeugkiste.
 * 
 * @author Jan-René Grünhagen 
 * @version 20.05.2016
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

    /** Gibt alle aus
     * 
     */
    public void gibAlle()
    {
        for (Baukloetze klotz : inhalt) {
            System.out.println(klotz.gibGewicht());
        }
    }
    
    /**
     * Gibt das Gewicht zurück
     */
    public void gibGewicht()
    {
        gesamtgewicht=0;
        for (Baukloetze klotz : inhalt) {
           gesamtgewicht+=klotz.gibGewicht();
        }
        System.out.println(gesamtgewicht);
    }
    
    /**
     * fügt einen bauklotz hinzu
     * @param klotz der entsprechende klotz
     */
    public void hinzufuegen(Baukloetze klotz)
    {
        inhalt.add(klotz);
    }
    
    /**
     * entfernt einen Bauklotz
     * @param position die Position
     */
       public void entfernen(int position)
    {
        inhalt.remove(position);
    }
}
