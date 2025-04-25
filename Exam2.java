import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Exam2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Exam2
     */
    public Exam2()
    {
        // initialise instance variables
        ArrayList<Double> temperatures = new ArrayList<Double>();
        Collections.sort(temperatures);                    
        Double max = Collections.max(temperatures);        
        Double min = Collections.min(temperatures);       
        Collections.reverse(temperatures); 
        
        temperatures.add(37.5);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(39.3);
        temperatures.add(47.0);
        temperatures.add(7.1); //
        
        analyzeTemperature(temperatures);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public int sampleMethod(int y)
{
    // Question 24
    //(a)
    String str1 = "Jeyanan";
    String str2 = "Jeyanan";
    
    //(b)
    if (str1.equals(str2)) {
        //(c)
        System.out.println("strings are equal");
    } else {
        //(c)
        System.out.println("strings are not equal");
    }
    return y;
}


    //Question 25 exam 2 

public static void analyzeTemperature(ArrayList<Double> temps) {
    int feverCount = 0;
    double maxTemp = 0.0;

    for (Double temp : temps) {
        if (temp > 37.5) {
            feverCount++;
        }
        if (temp > maxTemp) {
            maxTemp = temp;
        }
    }

    System.out.println("max fever: ");
    System.out.println("fever count: ");
    
    
    // Question 26
    System.out.println("Max element (Collections.max): " + Collections.max(temps));

     // Question 27
    Collections.sort(temps);
    System.out.println("MAX element (sorted list): " + temps.get(temps.size() - 1));
}
}