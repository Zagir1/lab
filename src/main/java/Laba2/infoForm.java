package Laba2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class infoForm extends JFrame {
	public infoForm(String text) {
		super("Информация");
		
		JTextArea textArea = new JTextArea();
		
		textArea.setText(text);
		textArea.setEditable(false);
		
		this.add(textArea);
		this.setBounds(0, 0, 400, 500);
		this.setVisible(true);
	}
	public infoForm() {
		super("Информация");
		
		JLabel label = new JLabel();
		label.setText(
				"<html>" +
						"Zagir Achatovich 20130718" + "<br>"
						+ "Murat Alexandrovich 20130721" + "<br>"
						+ "Emil Ruslanovich 20130836" + "<br>"
						+ "Artem Vladimirovich 20130828"
				);
		
		this.add(label);
		this.setBounds(0, 0, 400, 500);
		this.setVisible(true);
	}
}

