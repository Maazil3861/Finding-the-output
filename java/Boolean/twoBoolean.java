import java.io.*; 
import java.lang.*; 

class twoBoolean
{
    public static void main(String [] args) 
    {
        twoBoolean p = new twoBoolean();
        p.start();
    }

    void start() 
    {
        boolean b1 = false;      // The boolean b1 in start method is different from boolean b1 in fix function. 
        boolean b2 = fix(b1);    

	System.out.println(b1 + " " + b2);
    }

    boolean fix(boolean b1) 
    {
        b1 = true;    // // The boolean b1 in start method is different from boolean b1 in fix function. 
        return b1;
    }
} 
/*OUTPUT 
false true
*/
