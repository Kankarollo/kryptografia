/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObsługaPlików;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Leonard
 */
public class ZapisPliku {
    File f;
    PrintWriter sc;
    String s = "Ala ma kota.";
    
    public void ZapisTest(String path, String tekst) throws IOException
    {
        f = new File(path);
        sc = new PrintWriter(f);
        sc.println(tekst);
        sc.close();
        
        
        
        
    }
    
    
}
