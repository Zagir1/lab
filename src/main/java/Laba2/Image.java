package Laba2;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
public class Image extends JComponent {
	BufferedImage image;
	public Image() {
		// получаем изображение и проверяем на доступность
		try
		{
			image = ImageIO.read(new File("src/Логотип УГАТУ.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void paintComponent(Graphics g)
	{
		if(image == null) return;
		// Отображение рисунка в левом верхнем углу.
		g.drawImage(image, 20, 20, 150, 110, null);
	}

}