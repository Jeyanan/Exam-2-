import java.util.ArrayList;

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
        
        temperatures.add(37.5);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(39.3);
        temperatures.add(47.0);
        temperatures.add(7.1);
        
        analyzeTemparature(temperatures);
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
    String str1 = "Jeyanan";
    String str2 = "Jeyanan";
    if (str1.equals(str2)) {
        System.out.println("strings are equal");
    } else {
        
    }
    return y;
}


    //Question 25 

public static void analyzeTemparature(ArrayList<Double> temps) {
    int feverCount = 0;
    double maxTemp = Double.MIN_VALUE;

    for (double temp : temps) {
        if (temp > 37.5) {
            feverCount++;
        }
        if (temp > maxTemp) {
            maxTemp = temp;
        }
    }

    System.out.println("max fever: ");
    System.out.println("fever count: ");
}
}