
/**
 * Beschreiben Sie hier die Klasse Pyramiede.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Pyramide extends Baukloetze
{
    double grundflaeche;
    double hoehe;
    
    /**
     * Konstruktor für Objekte der Klasse Pyramiede
     */
    public Pyramide(double laenge, double breite, double hoehe)
    {
        this.hoehe=hoehe;
        this.grundflaeche=laenge*breite;

    }
    
    public double volumenInCm3()
    {
        return (grundflaeche*hoehe)/3;
    }

    public double gibGewicht()
    {
        return volumenInCm3()*super.gibHolz();    
    }
}
