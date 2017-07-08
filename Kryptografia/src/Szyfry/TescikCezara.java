/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import ObsługaPlików.ZapisPliku;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TescikCezara {
    
    /*
    Pamietac o dobrym pathie do pliku!
    */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Cezar xd = new Cezar();
        xd.setText("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\Cezar.txt");
        xd.setKey(3);
        ZapisPliku zp = new ZapisPliku();
        zp.ZapisTest("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\Cezar_Kod.txt",xd.CezarSzyfruj());
        System.out.println(xd.CezarSzyfruj());
        xd.setText("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\Cezar_Kod.txt");
        System.out.println(xd.CezarDeszyfruj());
        zp.ZapisTest("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\Cezar_OdKod.txt",xd.CezarDeszyfruj());
    }
}
