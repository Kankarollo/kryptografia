/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OknoUżytkownika;

import Szyfry.Cezar;
import Szyfry.SzyfryHarcerskie;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;


/**
 *
 * @author Leonard
 */
public class SzyfrowanieOkno extends JFrame implements ActionListener{
    
    String loadpath, savepath;
    String[] Ciphers = {"Cesar","Scout's Code","<Vigenere> In progress"};
    boolean _de_cipher;
    JFileChooser jfc;
    JButton bLoadFile, bSaveFile, bGenerate, bKey;
    JLabel lLoadFile ,lSaveFile, lCiphers ,lKey, lValidate;
    JTextField tLoadFile,tSaveFile, tKey;
    JComboBox cbCiphers;
    
    
    public SzyfrowanieOkno(boolean de_cipher){
        _de_cipher = de_cipher;
        if(de_cipher) setTitle("Szyfrowanie");
        else setTitle("Deszyfrowanie");
              
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(200,200);
        setSize(600,400);
        setLayout(null);
        
        //label
        lLoadFile = new JLabel("Load file:");
        lLoadFile.setBounds(50, 50, 100, 30);
        add(lLoadFile);
        
        lCiphers = new JLabel("Choose Cipher:");
        lCiphers.setBounds(30, 100, 150, 30);
        add(lCiphers);
        
        lSaveFile = new JLabel("Save file:");
        lSaveFile.setBounds(50, 150, 100, 30);
        add(lSaveFile); 
        
        lKey = new JLabel("Key:");
        lKey.setBounds(400,100,50,30);
        add(lKey);
        
        lValidate = new JLabel("");
        lValidate.setBounds(300, 250, 150, 30);
        add(lValidate);
       
        //TextField
        tLoadFile = new JTextField("");
        tLoadFile.setBounds(200,50,300,30);
        add(tLoadFile);
        
        tSaveFile = new JTextField("");
        tSaveFile.setBounds(200,150,300,30);
        add(tSaveFile);
        
        tKey = new JTextField("(optional)");
        tKey.setBounds(430,100,130,30);
        add(tKey);
        
        //button
        bLoadFile = new JButton("...");
        bLoadFile.setBounds(500, 50, 29, 29);
        add(bLoadFile);
        bLoadFile.addActionListener(this);
        
        bSaveFile = new JButton("...");
        bSaveFile.setBounds(500, 150, 29, 29);
        add(bSaveFile);
        bSaveFile.addActionListener(this);
        
        bGenerate = new JButton("Generate");
        bGenerate.setBounds(300, 200, 130, 30);
        add(bGenerate);
        bGenerate.addActionListener(this);
        
        bKey = new JButton("...");
        bKey.setBounds(560, 100, 29, 29);
        add(bKey);
        bKey.addActionListener(this);
        
        //ComboBox 
        cbCiphers = new JComboBox(Ciphers); //Can be improved by enum in future
        cbCiphers.setBounds(200, 104, 150, 20);
        cbCiphers.setSelectedIndex(0);
        add(cbCiphers);
        cbCiphers.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == bLoadFile){
            loadpath = LoadFile(loadpath);
            //System.out.println(path);
            tLoadFile.setText(loadpath);
        }
        else if(src == bSaveFile){
            savepath = SaveFile(savepath);
            //System.out.println(path);
            tSaveFile.setText(savepath);
        }
        else if(src == bKey)
        {
            tKey.setText(LoadFile(null));
        }
        else if(src == bGenerate){
            switch((String)cbCiphers.getSelectedItem()){
                case "Cesar": 
                try {
                    if(_de_cipher) Cezar.HashCesar(loadpath, savepath);
                    else Cezar.CrackCesar(loadpath, savepath);
                } catch (IOException ex) {
                    Logger.getLogger(SzyfrowanieOkno.class.getName()).log(Level.SEVERE, null, ex);
                }
                lValidate.setText("Coding Complete!");
                lValidate.setForeground(Color.green);
                    break;
                case "Scout's Code":
                try {
                    SzyfryHarcerskie.ScoutsHash(tKey.getText(), loadpath, savepath);
                } catch (IOException ex) {
                    Logger.getLogger(SzyfrowanieOkno.class.getName()).log(Level.SEVERE, null, ex);
                }
                lValidate.setText("Coding Complete!");
                lValidate.setForeground(Color.green);
                    break;
                case "Vigenere": // in progress....
                lValidate.setText("Text");
                lValidate.setForeground(Color.green);
                    break;
                default: break;
            }
            
        }

    }
    
    public static String LoadFile(String _path)
    {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			_path = selectedFile.getAbsolutePath();
		}
        return _path;
    }
    public static String SaveFile(String _path)
    {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		//int returnValue = jfc.showOpenDialog(null);
		int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			_path = selectedFile.getAbsolutePath();
		}
        return _path;
    }
    
    
}
