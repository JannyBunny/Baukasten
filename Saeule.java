
/**
 * Beschreiben Sie hier die Klasse Saeule.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Saeule extends Baukloetze
{
    double grundflaeche;
    double hoehe;
    /**
     * Konstruktor für Objekte der Klasse Saeule
     */
    public Saeule(double seitenlaenge1, double seitenlaenge2, double hoehe)
    {
        grundflaeche=(seitenlaenge1*seitenlaenge2)/2; //((seitenlaenge1*seitenlaenge2)/4)*Math.sqrt(3);
        this.hoehe=hoehe;

    }

    public double volumenInCm3()
    {
        return grundflaeche*hoehe;
    }

    public double gibGewicht()
    {
        return volumenInCm3()*super.gibHolz();    
    }
}
