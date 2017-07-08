/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OknoUżytkownika;

import ObsługaPlików.ZapisPliku;
import Szyfry.Cezar;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leonard
 */
public class SzyfrCezara extends JFrame implements ActionListener{
    
    JButton bSzyfruj, bDodajPlik;
    
    public SzyfrCezara(){
        super("Szyfr Cezara");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50,50);
        setSize(300,100);
        setLayout(new FlowLayout());
        
        bSzyfruj = new JButton("Szyfruj");
        bDodajPlik = new JButton("Dodaj Plik");
        add(bSzyfruj);
        add(bDodajPlik);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == bSzyfruj){
        Cezar xd = new Cezar();
            try {
                xd.setText("C:\\Users\\Leonard\\Desktop\\plik1.txt");
            } catch (FileNotFoundException ex) {
                System.out.println("Nia ma takiego pliku!!!");
            }
        xd.setKey(3);
        ZapisPliku zp = new ZapisPliku();
            try {
                zp.ZapisTest("C:\\Users\\Leonard\\Desktop\\plik1.txt", xd.CezarSzyfruj());
            } catch (IOException ex) {
                System.out.println("Nie da się zapisać!!!");
            }
        System.out.println(xd.CezarSzyfruj());
        }
    }
}
