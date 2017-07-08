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
    
    /*public static void main(String[] args) throws FileNotFoundException, IOException{
        Cezar xd = new Cezar();
        xd.setText("C:\\Users\\Leonard\\Desktop\\plik1.txt");
        xd.setKey(3);
        ZapisPliku zp = new ZapisPliku();
        zp.ZapisTest("C:\\Users\\Leonard\\Desktop\\plik1.txt", xd.CezarSzyfruj());
        System.out.println(xd.CezarSzyfruj());
        xd.setText("C:\\Users\\Leonard\\Desktop\\plik1.txt");
        System.out.println(xd.CezarDeszyfruj());
    } to jest testowy main - wszystko bangla jak złoto*/
}
