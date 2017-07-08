/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObsługaPlików;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Leonard
 */
public class OdczytPliku {
    File f;
    Scanner sc;
    
    public String tekst(String path) throws FileNotFoundException{
        f = new File(path);
        sc = new Scanner(f);
        String s = new String();
        String tekstZPliku = new String();
        while(sc.hasNext()){
            s = sc.nextLine();
            tekstZPliku+=s + " ";
        }
        sc.close();
        return tekstZPliku;
    }
    
}
