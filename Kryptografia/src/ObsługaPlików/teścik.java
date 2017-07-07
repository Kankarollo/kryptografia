/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObsługaPlików;

import java.io.FileNotFoundException;

/**
 *
 * @author Leonard
 */
public class teścik {
   
    public static void main(String[] args){
    OdczytPliku xd = new OdczytPliku();
    try{
    System.out.println(xd.tekst("C:\\Users\\Leonard\\Desktop\\plik1.txt"));
    }catch(FileNotFoundException e){
        System.out.println("Nie ma takiego pliku");
    }
    }
}
