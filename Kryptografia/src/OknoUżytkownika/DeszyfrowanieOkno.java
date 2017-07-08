/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OknoUżytkownika;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leonard
 */
public class DeszyfrowanieOkno extends JFrame{
    
    JButton bCezar, bVigenere, bHarcerskie;
    
    public DeszyfrowanieOkno(){
        super("Deszyfrowanie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50,50);
        setSize(300,100);
        setLayout(new FlowLayout());
        
        bCezar = new JButton("Szyfr Cezara");
        bVigenere = new JButton("Szyfr Vigenere");
        bHarcerskie = new JButton("Szyfry Harcerskie");
        add(bCezar);
        add(bVigenere);
        add(bHarcerskie);
        
        setVisible(true);
    }
}

