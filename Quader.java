
/**
 * Beschreiben Sie hier die Klasse Quader.
 * 
 * @author Jan-René Grünhagen 
 * @version 20.05.2016
 */
public class Quader extends Baukloetze
{
    private double laenge;
    private double breite;
    private double hoehe;
    /**
     * Konstruktor für Objekte der Klasse Quader
     */
    public Quader(double laenge, double breite, double hoehe)
    {
       this.laenge = laenge;
       this.breite = breite;
       this.hoehe = hoehe;
    }
 
    /**
     * Rückgabe des Volumens
     * @return volumen in cm³
     */
    public double volumenInCm3()
    {
        return laenge*breite*hoehe;
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
        System.out.println("\n Bauklotz: \t\tQuader \n Länge: \t\t"+laenge+"\n Breite: \t\t"+breite+"\n Höhe: \t\t\t"
        +hoehe+ "\n Volumen in cm³: \t"+volumenInCm3()+"\n Gewicht: \t\t"+gibGewicht());
    }
    
}
