
/**
 * Write a description of class CLASe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CLASe
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CLASe
     */
    public CLASe()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        assert y>0 : "incorrecto";// put your code here
        return x + (y * 2);
    }
    
    public void Method(int w)
    {
        
        if (w>=0)
        {
           System.out.println("variable positiva");
        }
        else
        {
            System.out.println("variable negativa");
        }
        
        }
    }


