package Laba2;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Menu {
	
	private Image logo;
	
	public Menu(JFrame frame,ActionListener actionListener, JPanel panel) {
		logo = new Image();
		
		JMenu mainMenu = new JMenu("Главная");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menu1 = new JMenuItem("Отобразить логотип УГАТУ");
		JMenuItem menu2 = new JMenuItem("Выход");
		JMenuItem menu3 = new JMenuItem("Загрузить  файл в проект6");
		
		mainMenu.add(menu1);
		mainMenu.add(menu2);
		mainMenu.add(menu3);
		
		menuBar.add(mainMenu);
		
		frame.setJMenuBar(menuBar);
		
		menu1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.add(logo);
				logo.setBounds(200,0,200,200);
			}
		});
		menu2.addActionListener(actionListener);
		menu3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader reader = new FileReader("src\\rabota.txt");
					int c;
					String text = "";
					while ((c=reader.read()) != -1) {
						text = text + (char)c;
					}
					infoForm form = new infoForm(text);
				} catch(IOException ex){
					System.out.println(ex.getMessage());
			    }
			}
		});
	}
	public Image getImage() {
		return logo;
	}
} 

