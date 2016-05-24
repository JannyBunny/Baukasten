
/**
 * Beschreiben Sie hier die Klasse Zylinder.
 * 
 * @author Jan-René Grünhagen 
 * @version 20.05.2016
 */
public class Zylinder extends Baukloetze
{
    private double radius;
    private double hoehe;

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
        return volumenInCm3()*gibHolz();    
    }
     
    /**
      * gibt info zum Klotz aus
      */
    public Object gibInfo()
    {
        System.out.println("\n Bauklotz: \t\tZylinder \n Radius: \t\t"+radius+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht());
        return "\n Bauklotz: \t\tZylinder \n Radius: \t\t"+radius+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht();
    }
}
