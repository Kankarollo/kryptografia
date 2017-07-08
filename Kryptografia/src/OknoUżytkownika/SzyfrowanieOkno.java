/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OknoUżytkownika;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leonard
 */
public class SzyfrowanieOkno extends JFrame implements ActionListener{
    
    JButton bCezar, bVigenere, bHarcerskie;
    
    public SzyfrowanieOkno(){
        super("Szyfrowanie");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == bCezar){
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SzyfrCezara();
            }
            });
        }
    }
}
