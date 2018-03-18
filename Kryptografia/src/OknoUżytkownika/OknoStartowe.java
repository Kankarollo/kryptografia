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
public class OknoStartowe extends JFrame implements ActionListener{
 
    JButton bSzyfruj, bDeszyfruj;
    
    public OknoStartowe() {
        super("Zarombista Aplikacja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50,50);
        setSize(300,100);
        setLayout(new FlowLayout());
        
        bSzyfruj = new JButton("Szyfruj");
        bDeszyfruj = new JButton("Deszyfruj");
        add(bSzyfruj);
	add(bDeszyfruj);
        bSzyfruj.addActionListener(this);
        bDeszyfruj.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == bSzyfruj){
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                boolean cipher = true;
                new SzyfrowanieOkno(cipher);
            }
            });
        }
        else {
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                boolean cipher = false;
                new SzyfrowanieOkno(cipher);
            }
            });
        }
    }
}
