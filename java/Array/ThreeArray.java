import java.io.*; 
import java.lang.*; 

class ThreeArray
{
    public static void main(String [] args) 
    {
        ThreeArray p = new ThreeArray();
        p.start();
    }

    void start() 
    { 

        long [] a1 = {3,4,5};
	long [] a2 = fix(a1);   // function call to fix Update a1[1] 3 -> 7   Update a2[1] 3 -> 7
  
	System.out.print(a1[0] + a1[1] + a1[2] + " ");  // 3+4+5
        System.out.println(a2[0] + a2[1] + a2[2]);  	
		
	System.out.println(a2[0]);   // 3
	System.out.println(a2[1]);   // 7 update value .
	System.out.println(a2[2]);   // 5 
	
	System.out.println(a1[0]);   // 3
	System.out.println(a1[1]);   // 7 update value .
	System.out.println(a1[2]);   // 5 
 
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
}
/*OUTPUT 
15 15
3
7
5
3
7
5
*/
