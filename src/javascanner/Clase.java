
package javascanner;

import java.util.Scanner;

public class Clase {

    //constructor
    public Clase() {
    }
   
    //variable
    String H;
    
    //methodo
    public void digita( String Texto ){
       
    Scanner Digitar = new Scanner(System.in);    

    System.out.println("- Digita un Texto -");
    
    Texto = Digitar.next();
    
    System.out.println(Texto);
        
    }
    
    
}
