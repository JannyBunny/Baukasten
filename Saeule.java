
/**
 * Beschreiben Sie hier die Klasse Saeule.
 * 
 * @author Jan-René Grünhagen 
 * @version 20.05.2016
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
    /**
     * Rückgabe des Volumens
     * @return volumen in cm³
     */
    public double volumenInCm3()
    {
        return grundflaeche*hoehe;
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
    public void gibInfo()
    {
        System.out.println("\n Bauklotz: \t\tQuader \n flaeche: \t\t"+grundflaeche+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht());
    }
}
