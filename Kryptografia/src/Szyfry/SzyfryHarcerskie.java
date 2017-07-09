/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import ObsługaPlików.OdczytPliku;
import java.io.FileNotFoundException;

/**
 *
 * @author Leonard
 */
public class SzyfryHarcerskie {
    
    //static String Gadery = "GADERYPOLUKI";
    //static String Ren = "POLITYKARENU";
    String text;
    String Gadery;
    char [] charGD = null;                                                      //KOD PO ZAMIANIE
    char [] podajdalej = null;                                                  //KOD PRZED ZAMIANA
    
    public void SetCode(String path) throws FileNotFoundException{
          OdczytPliku op = new OdczytPliku();
          Gadery = op.tekst(path);

        Gadery = Gadery.toUpperCase();
        podajdalej = Gadery.toCharArray();          
        charGD = Gadery.toCharArray();
        int i = Gadery.length()/2;                                              //dzielimy na pary
        char change = 0;
        
        //pętelka
        for(int j = 0; j<i; j++)
        {
            for(int k = 0; k<2; k++)
            {
                if (k == 0) 
                {
                    change = charGD[k +(j*2)];
                    charGD[k +(j*2)] = charGD[k +(j*2)+1];
                }
                else  charGD[k +(j*2)] = change;                                    
            }
        }
    }
    
    public void setText(String path) throws FileNotFoundException{
          OdczytPliku op = new OdczytPliku();
          text = op.tekst(path);
          text = text.toUpperCase();
      }

    public String Szyfracja()
    {
        String SzyfrHarcerski;
        char [] d = text.toCharArray();
        for(int i = 0; i<text.length(); i++)
        {
            for(int j = 0; j<Gadery.length(); j++)
            {
                if(d[i]==podajdalej[j])
                {
                    d[i] = charGD[j];
                    break;
                }
            }
        }
        SzyfrHarcerski = String.valueOf(d);
        return SzyfrHarcerski;
    }           
}
