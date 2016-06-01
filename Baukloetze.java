
/**
 * Beschreiben Sie hier die Klasse Baukloetze.
 * 
 * @author Jan-René Grünhagen 
 * @version 20.05.2016
 */
public abstract class Baukloetze  
{
//     private double gewicht;
    private Object info;
    private final double holz = 0.8;
    /**
     * Konstruktor für Objekte der Klasse Baukloetze
     */
    public Baukloetze()
    {
//         gewicht=0;
    }
    
//     /**
//      * Gibt das gewicht zurück 
//      * @return  das Gewicht.
//      */
//     public  double gibGewicht()
//     {
//         return gewicht;
//     }
    
    /**
     * Gibt die Info zurück 
     * @return Infos über den Bauklotz.
     */
    public Object gibInfo()
    {
        return info;
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
        return "Bauklotz";
    }
   
    public abstract double volumenInCm3();
    
    /**
     * Gibt das gewicht
     * @return das Gewicht
     */
    public double gibGewicht()
    {
        return volumenInCm3()*gibHolz();    
    }
    
}
