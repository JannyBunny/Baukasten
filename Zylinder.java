
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

    public double volumenInCm3()
    {
        return Math.PI*(radius*radius)*hoehe;
    }

    public double gibGewicht()
    {
        return volumenInCm3()*super.gibHolz();    
    }
}
