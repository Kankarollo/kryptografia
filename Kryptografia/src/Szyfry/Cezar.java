/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import ObsługaPlików.OdczytPliku;
import ObsługaPlików.ZapisPliku;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Leonard
 */
public class Cezar {
    
    public String text;
    public int key;
    
    public String CezarSzyfruj(){
        char [] chText = text.toCharArray();
        for(int i = 0; i<text.length(); i++){
            int a = (int)chText[i] + key;
            chText[i] = (char)a;
        }
        String s = new String(chText);
        return s;
    }
    
    public String CezarDeszyfruj(){
        char [] chText = text.toCharArray();
        for(int i = 0; i<text.length(); i++){
            int a = (int)chText[i] - key;
            chText[i] = (char)a;
        }
        String s = new String(chText);
        return s;
    }
    
    public void setText(String path) throws FileNotFoundException{
        OdczytPliku op = new OdczytPliku();
        text = op.tekst(path);
    }
    
    public void setKey(int i){
        key = i;
    }
    
    public static void HashCesar(String loadpath, String savepath) throws FileNotFoundException, IOException{
        Cezar Hash = new Cezar();
        Hash.setText(loadpath);
        Hash.setKey(3);
        ZapisPliku zp = new ZapisPliku();
        zp.ZapisTest(savepath, Hash.CezarSzyfruj());
        //System.out.println(Hash.CezarSzyfruj());
    }// to jest testowy main - wszystko bangla jak złoto
    
    public static void CrackCesar(String loadpath, String savepath) throws FileNotFoundException, IOException{
        Cezar crack = new Cezar();
        crack.setText(loadpath);
        crack.setKey(3);
        ZapisPliku zp = new ZapisPliku();
        zp.ZapisTest(savepath, crack.CezarDeszyfruj());
        System.out.println(crack.CezarDeszyfruj());
        System.out.println();
    }
}
