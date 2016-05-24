

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
    private Spielzeugkiste spielzeu1;
    //     private Baukloetze baukloet1;
    private Zylinder zylinder1;
    private Saeule saeule1;
    private Pyramide pyramide1;
    private Quader quader1;

    
    
    
    
    
    

    
    
    
    
    
    

    
    
    
    
    
    

    
    
    
    
    
    

    /**
     * Default constructor for test class Test
     */
    public TestClass()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        spielzeu1 = new Spielzeugkiste();
        //baukloet1 = new Baukloetze();
        zylinder1 = new Zylinder(2, 3);
        saeule1 = new Saeule(2, 2, 4);
        pyramide1 = new Pyramide(2, 2, 3);
        quader1 = new Quader(2, 4, 6);
        spielzeu1.hinzufuegen(quader1);
        spielzeu1.gibAlle();
        spielzeu1.gibGewicht();
        spielzeu1.hinzufuegen(saeule1);
        spielzeu1.hinzufuegen(pyramide1);
        spielzeu1.gibAlle();
        spielzeu1.gibAlle();
        spielzeu1.gibGewicht();
        spielzeu1.gibGewicht();
        spielzeu1.gibAlle();
        spielzeu1.gibAlle();
        spielzeu1.hinzufuegen(pyramide1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
