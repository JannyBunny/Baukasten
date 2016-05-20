
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
    
      /**
     * Rückgabe des Volumens
     * @return volumen in cm³
     */
    public double volumenInCm3()
    {
        return (grundflaeche*hoehe)/3;
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
        System.out.println("\n Bauklotz: \t\tQuader \n Länge: \t\t"+laenge+"\n Breite: \t\t"+breite+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht());
    }
}
