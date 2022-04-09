package Laba2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class transfer_logo implements ActionListener{
	private JComboBox box;
	private Image image;
	private int[] array;
	private subversion subversion;
	public transfer_logo(JComboBox box, Menu menu, subversion subversion) {
		this.box = box;
		image = menu.getImage();
		this.subversion = subversion;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String item = (String)box.getSelectedItem();
		if (item=="Переместить логотип УГАТУ в верхний правый угол")
		{
			image.setLocation(200, 0);
		}
		
		if (item=="Переместить логотип УГАТУ в середину")
		{
			image.setLocation(100, 0);
		}
		
		if (item=="Переместить логотип УГАТУ в левый верхний угол")
		{
			image.setLocation(0, 0);
		}
		if (item=="Отсортировать данные в проекте 6") {
			if (subversion.getArray() == null) {
				subversion.getCreateArrayBut().doClick();
			}
			array = subversion.getArray();
			Sort sort = new Sort(array);
			sort.bubbleSorter();
			array = sort.getArray();
			subversion.setTextToArrayLabel(array);
		}
	}
}
