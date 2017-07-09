/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import ObsługaPlików.ZapisPliku;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TescikSzyfryHarcerskie {
    
    /*
    Pamietac o dobrym pathie do pliku!
    */
    public static void main(String[] args) throws FileNotFoundException, IOException{
       
        SzyfryHarcerskie test = new SzyfryHarcerskie();
        test.setText("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\SzyfryHarcerskie.txt");                           //Wpisać drogę do pliku z tekstem
        test.SetCode("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\SzyfryHarcerskieKod.txt");                        //Wpisać drogę do pliku z Kodem
        ZapisPliku zp = new ZapisPliku();
        zp.ZapisTest("C:\\Users\\Kanka\\Desktop\\Paweł\\Programowanie+\\Kryptografia\\SzyfryHarcerskie_Wynik.txt",test.Szyfracja());    //Wpisać drogę gdzie chcesz zapisać wynik
    }
}