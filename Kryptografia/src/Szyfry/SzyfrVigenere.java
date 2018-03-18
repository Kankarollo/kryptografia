/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szyfry;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Leonard
 */
public class SzyfrVigenere {
    
    //inicjilizacja tabeli Vinegara
    public  char[]  Tabela()
    {
        char  [] Vigenere = null;
        List myList = new ArrayList();
        for(int i = 0; i<26; i++)
        {
         myList.add((char)(65+i));   
        }
        char zbieraj;
        for(int i = 0; i<26; i++)
        {
            for(int j = 0; j<26; j++)
            {
             zbieraj = (char) myList.get(0);
            }
        }
        for(int i = 0; i<26; i++)
        {
        System.out.print(myList.get(i));    
        }
        
        
        
        
        
        
        return Vigenere;
        
    }
    
    public static void main( String[] args)
    {
        SzyfrVigenere Test = new SzyfrVigenere();
        Test.Tabela();
    }
    
}
