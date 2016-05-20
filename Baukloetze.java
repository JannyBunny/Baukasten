
/**
 * Beschreiben Sie hier die Klasse Baukloetze.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Baukloetze
{
    private double gewicht;
    private double holz;
    /**
     * Konstruktor für Objekte der Klasse Baukloetze
     */
    public Baukloetze()
    {
        gewicht=0;
        holz = 0.8;
    }
    
    public double gibGewicht()
    {
        return gewicht;
    }
    
    public double gibHolz()
    {
        return holz;
    }
    
    public String toString()
    {
        return "blah";
    }
   
}
