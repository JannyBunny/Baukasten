
/**
 * Beschreiben Sie hier die Klasse Zylinder.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zylinder extends Baukloetze
{
    double radius;
    double hoehe;

    /**
     * Konstruktor für Objekte der Klasse Zylinder
     */
    public Zylinder(double radius, double hoehe)
    {
        this.hoehe=hoehe;
        this.radius=radius;
    }

    /**
     * Rückgabe des Volumens
     * @return volumen in cm³
     */
    public double volumenInCm3()
    {
        return Math.PI*(radius*radius)*hoehe;
    }
    
    /**
     * Gibt das gewicht
     * @return das Gewicht
     */
    public double gibGewicht()
    {
        return volumenInCm3()*super.gibHolz();    
    }
     /**
      * gibt info zum Klotz aus
      */
    public void gibInfo()
    {
        System.out.println("\n Bauklotz: \t\tZylinder \n Radius: \t\t"+radius+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht());
    }
}
