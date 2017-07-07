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
public class OknoStartowe extends JFrame{
 
    public OknoStartowe() {
        super("Zarombista Aplikacja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(50,50);
        setSize(300,100);
        setLayout(new FlowLayout());
        add(new JButton("Szyfruj"));
	add(new JButton("Deszyfruj"));
        setVisible(true);
    }
}
