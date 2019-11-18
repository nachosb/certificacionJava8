
/**
 * Write a description of class ddd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    // instance variables - replace the example below with your own
    private int x;

    {System.out.println("Inicializando variables inicio de clase");}
    
    public static void main(String[] args) {
        
        System.out.println("Comienzo del método main");
        
        {System.out.println("Prueba 1");}
        Prueba p = new Prueba();
        
        int z = p.sampleMethod(7);
        
        System.out.println(z);
        
        System.out.println("Fin del método main");
    }

    /**
     * Constructor for objects of class Prueba
     */
    public Prueba()
    {
        System.out.println("Comienzo del constructor");
       
        {System.out.println("Prueba 2");}
        
        x = 2;
        
        System.out.println("Fin del constructor");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        System.out.println("Comienzo del método sampleMethod");
        
        {System.out.println("Prueba 3");}
        
        return x + y;
    }
    
    {System.out.println("Inicializando variables fin de clase");}
}
