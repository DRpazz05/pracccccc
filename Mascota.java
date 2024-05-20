
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.String;
public class Mascota
{

    // instance variables - replace the example below with your own
    private int edad;
    private String nombre;
    private Double peso;//cuando quiera usar float en campo declaro Double

    /**
     * Constructor for objects of class Mascota
     */
    public Mascota()
    {
        // initialise instance variables
        edad = 4;
        nombre = "Nicky";
        peso = 9.90;
    
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void NickyTendra(int edad2)
    {
        edad = edad2 * 7;
        System.out.println(edad);
    }
    
    public void nickyPesara(float peso2)//en un metodo puedo usar un float en vez de un Double
    {
        peso = peso * peso2;
        System.out.println(peso);
    }
    
    
}
