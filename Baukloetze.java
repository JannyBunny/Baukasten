
/**
 * Beschreiben Sie hier die Klasse Baukloetze.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Baukloetze
{
    private double gewicht;
    final private double holz;
    /**
     * Konstruktor für Objekte der Klasse Baukloetze
     */
    public Baukloetze()
    {
        gewicht=0;
        holz = 0.8;
    }
    
    /**
     * Gibt das gewicht zurück 
     * @return  das Gewicht.
     */
    public double gibGewicht()
    {
        return gewicht;
    }
    
    /**
     * Gibt die Dichte von Holz zurück
     * @return  die Dichte von Holz.
     */
    public double gibHolz()
    {
        return holz;
    }
    
    /**
     * Return des toStrings() überschrieben dieser Klasse
     * @return Ein String
     */
    public String toString()
    {
        return "blah";
    }
   
}
