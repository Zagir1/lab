package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Info extends JButton implements ActionListener {
	
public Info(String title) {
	super(title);
	addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	infoForm form = new infoForm();
}
}


