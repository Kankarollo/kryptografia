/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OknoUżytkownika;

/**
 *
 * @author Leonard
 */
import java.awt.EventQueue;

public class StarterOkna{
    
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	@Override
	public void run() {
            new OknoStartowe();
	}
        });
    }
}
