/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import ObsługaPlików.OdczytPliku;
import ObsługaPlików.ZapisPliku;
import java.io.IOException;
import static java.lang.Character.getNumericValue;


public class Cezar {
    
        public  void Cezar(String path1, String path2, int key) throws IOException
        {
        OdczytPliku p = new OdczytPliku();
        
        
        
        String g = p.tekst(path1);
        int j = g.length();             //długość tekstu
        char c = g.charAt(0);  // returns 'l'
        char[] c_arr = g.toCharArray(); // returns a length 4 char array ['l','i','n','e']
        
        for(int i = 0; i<j; i++)
        {
            int l = getNumericValue(c_arr[i]) + key ;
            c_arr[i] = (char)l ;
        }
        
       
           String x = new String(c_arr);
        ZapisPliku xd = new ZapisPliku();
        xd.ZapisTest(path2, x);
        }
}
