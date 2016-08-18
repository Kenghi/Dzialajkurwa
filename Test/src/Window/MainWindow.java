package Window;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;

public class MainWindow {
	
	private JFrame frame;
	private JButton btnNewUser, btnButton;
	private JMenu mFile, mUsers, mAbout, mSkills;
	
				// uruchomienie //
	public static void main(String[] args){
	
	EventQueue.invokeLater(new Runnable()
    {
            @Override
            public void run()
            {
            	MainWindow window = new MainWindow();
				window.frame.setVisible(true);
            }
    });
}

public MainWindow(){
	initialize(); 
	}

				// inicjalizacja ramki//

private void initialize() {
	frame = new JFrame("Skill Matrix"); // nazwa okna
	frame.setSize(300, 300);			//wielkosc okna 
	frame.setLocationRelativeTo(null);	//
	frame.setResizable(false);  		 //okno nie zmienia rozmiarow
	
	frame.getContentPane().setLayout(null); 
	
	//dodwanie nowego pracownika
	
	btnNewUser = new JButton("New User");
	btnNewUser.setBounds(75,60,150,30);
	frame.getContentPane().add(btnNewUser);
	
	btnButton = new JButton("Jakis knefel");
	btnButton.setBounds(75,100,150,30);
	frame.getContentPane().add(btnButton);
	
} 
}

