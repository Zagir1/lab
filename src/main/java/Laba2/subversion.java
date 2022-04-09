package Laba2; //пакет Java классов

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion{
	int check = 0;
	int a = 0;
	int b = 0;
	private int[] array;
	private JLabel arrayLabel;
	private JButton createMasButt;
	public subversion() throws FileNotFoundException{
		JFrame main_GUI = new JFrame("subversion"); // создание графического окна
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		
		JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
		laba_info.setBounds(120,0,150,30);
		
		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(260,180,120,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		
		Info info = new Info("Информация");
		info.setBounds(30,180,120,40);
		
		Menu menu = new Menu(main_GUI, actionListener, main_panel);
		String[] items = {
				"Переместить логотип УГАТУ в верхний правый угол",
				"Переместить логотип УГАТУ в середину",
				"Переместить логотип УГАТУ в левый верхний угол",
				"Отсортировать данные в проекте 6"};
		
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(30,140,350,30);
		
		ActionListener transferlogo = new transfer_logo(comboBox, menu, this);
		comboBox.addActionListener(transferlogo);
		
		JTextField inputA = new JTextField();
		inputA.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					check = Integer.parseInt(inputA.getText());
				} catch (NumberFormatException nfe) {
					inputA.setText("");
				}
			}
		});
		inputA.setBounds(30,280,120,40);
		
		JTextField inputB = new JTextField();
		inputB.setBounds(260,280,120,40);
		inputB.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					check = Integer.parseInt(inputB.getText());
				} catch (NumberFormatException nfe) {
					inputB.setText("");
				}
			}
		});
		
		JLabel label1 = new JLabel ("Введите стороны треугольника(см):");
		label1.setBounds(30,220,300,40);
		JLabel labelA = new JLabel ("Введите сторону a (см):");
		labelA.setBounds(30,240,300,40);
		JLabel labelB = new JLabel ("Введите сторону b (см):");
		labelB.setBounds(260,240,300,40);
		JLabel labelResult = new JLabel();
		labelResult.setBounds(30,380,300,40);
		
		JButton calcButton = new JButton("Расчет");
		calcButton.setBounds(150,340,110,40);
		calcButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					a = Integer.parseInt(inputA.getText());
					b = Integer.parseInt(inputB.getText());
					labelResult.setText(
					"<html>" +
					"Результат:" + "<br>" +
					Integer.toString(2*a+b)
					);
				} catch (NumberFormatException nfe) {
				}
			}
		});
		
		createMasButt = new JButton("Создать массив");
		arrayLabel = new JLabel("");
		arrayLabel.setBounds(300,320,50,200);
		createMasButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CreateArray rndArray = new CreateArray();
				rndArray.create();
				array = rndArray.getArray();
				setTextToArrayLabel(array);
			}
			
		});
		createMasButt.setBounds(130,380,150,40);
		
		main_panel.add(createMasButt);
		main_panel.add(arrayLabel);
		main_panel.add(calcButton);
		main_panel.add(labelResult);
		main_panel.add(label1);
		main_panel.add(labelA);
		main_panel.add(labelB);
		main_panel.add(laba_info);
		main_panel.add(button_exit);
		main_panel.add(info);
		main_panel.add(comboBox);
		main_panel.add(inputA);
		main_panel.add(inputB);
		
		main_GUI.add(main_panel);
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(0, 0, 420, 580);
		main_GUI.setLocation(400,400);
		main_GUI.setResizable(false); // фиксированный размер окна
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
public static void main(String[] args) throws FileNotFoundException  { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
	subversion student= new subversion();
	}
public void setTextToArrayLabel(int[] array) {
	String result = "";
	for (int el : array) {
		result = result + String.valueOf(el) + "; ";
	}
	arrayLabel.setText("<html>" + "Массив:" + "<br>" + result);
}
public int[] getArray() {
	return array;
}
public JButton getCreateArrayBut() {
	return createMasButt;
}
}